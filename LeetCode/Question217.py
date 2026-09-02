# LeetCode Q217: Contains Duplicate
'''
Given an integer array nums, return True if any value appears
at least twice. Otherwise, return False.
'''

# Approach: Hash Set

class Solution(object):
    def containsDuplicate(self, nums):
        return len(nums) != len(set(nums))
        