# LeetCode Q35: Search Insert Position
'''
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it should be inserted.
'''

# Approach: Binary Search

class Solution(object):
    def searchInsert(self, nums, target):
        left, right = 0, len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1

        return left