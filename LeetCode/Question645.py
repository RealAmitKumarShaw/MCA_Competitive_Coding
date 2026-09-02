# LeetCode Q645: Set Mismatch
'''
Given an array containing numbers from 1 to n, one number is duplicated
and one number is missing. Find both numbers.
'''

# Approach: Hash Set

class Solution(object):
    def findErrorNums(self, nums):
        seen = set()
        
        for num in nums:
            if num in seen:
                duplicate = num
            seen.add(num)

        for i in range(1, len(nums) + 1):
            if i not in seen:
                missing = i
                break

        return [duplicate, missing]        