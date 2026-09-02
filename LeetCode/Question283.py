# LeetCode Q283: Move Zeroes
'''
Given an integer array nums, move all 0's to the end
while keeping the relative order of non-zero elements.
'''

# Approach: Two Pointer

class Solution(object):
    def moveZeroes(self, nums):
        j = 0

        for i in range(len(nums)):
            if nums[i] != 0:
                nums[j], nums[i] = nums[i], nums[j]
                j += 1        