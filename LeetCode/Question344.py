# LeetCode Q344: Reverse String
'''
Given a list of characters, reverse the string in-place.
'''

# Approach: Two Pointer

class Solution(object):
    def reverseString(self, s):
        left, right = 0, len(s) - 1

        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1                    