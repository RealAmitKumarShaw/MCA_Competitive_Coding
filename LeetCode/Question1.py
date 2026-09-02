# LeetCode Q1: Two Sum
'''
Given an array of integers nums and an integer target,
return the indices of two numbers that add up to target.
'''
# Approach: Hash Map

class Solution(object):
    def twoSum(self, nums, target):
        mp = {}

        for i, num in enumerate(nums):
            need = target - num

            if need in mp:
                return [mp[need], i]

            mp[num] = i