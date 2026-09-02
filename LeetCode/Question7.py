# LeetCode Q7: Reverse Integer
'''
Given a signed 32-bit integer x, reverse its digits.
Return 0 if the reversed integer goes outside the 32-bit range.
'''

# Approach: Reverse Digits

class Solution(object):
    def reverse(self, x):
        INT_MAX = 2**31 - 1

        sign = -1 if x < 0 else 1
        x = abs(x)

        rev = 0

        while x:
            digit = x % 10
            x //= 10

            if rev > INT_MAX // 10 or (rev == INT_MAX // 10 and digit > 7):
                return 0

            rev = rev * 10 + digit

        return sign * rev