# LeetCode Q268: Missing Number
'''
Given an array containing n distinct numbers from 0 to n,
find the only number that is missing from the array.
'''

# Approach: XOR

class Solution(object):
    def missingNumber(self, nums):
        result = len(nums)

        for i, num in enumerate(nums):
            result ^= i ^ num

        return result