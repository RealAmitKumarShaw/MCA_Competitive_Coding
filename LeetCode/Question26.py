# LeetCode Q26: Remove Duplicates from Sorted Array
'''
Given a sorted integer array nums, remove the duplicates in-place so that 
each unique element appears only once. Return the number k of unique elements.
'''
# Approach: Two Pointer

class Solution:
    def removeDuplicates(self, nums):
        j = 1

        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[j] = nums[i]
                j += 1

        return j
