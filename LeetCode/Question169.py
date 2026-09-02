# LeetCode Q169: Majority Element
'''
Given an array nums, find the element that appears more than
n/2 times. It is guaranteed that such an element exists.
'''

# Approach: Boyer-Moore Voting Algorithm

class Solution(object):
    def majorityElement(self, nums):
        candidate = None
        count = 0

        for num in nums:
            if count == 0:
                candidate = num

            count += 1 if num == candidate else -1

        return candidate