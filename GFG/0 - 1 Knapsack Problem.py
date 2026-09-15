'''
Given n items with their values and weights, find the maximum value
that can be put in a knapsack of capacity W. Each item can be taken
only once.
'''

# Approach: Dynamic Programming

class Solution:
    def knapsack(self, W: int, val: list[int], wt: list[int]) -> int:
        dp = [0] * (W + 1)

        for i in range(len(wt)):
            for j in range(W, wt[i] - 1, -1):
                dp[j] = max(dp[j], dp[j - wt[i]] + val[i])

        return dp[W]