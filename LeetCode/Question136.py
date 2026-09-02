# LeetCode Q136: Single Number
'''
Given a non-empty array of integers, every element appears twice
except for one. Find and return the element that appears only once.
'''

# Approach: XOR

class Solution(object):
    def singleNumber(self, nums):
        result = 0

        for num in nums:
            result ^= num

        return result        