# LeetCode Q66: Plus One
'''
Given a large integer represented as an array of digits,
increment the integer by one and return the resulting array.
'''

# Approach: Carry

class Solution:
    def plusOne(self, digits):
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1
                return digits
            digits[i] = 0

        return [1] + digits