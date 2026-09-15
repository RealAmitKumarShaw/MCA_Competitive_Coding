# LeetCode Q11: Container With Most Water
'''
Given an array of heights, find two lines that form a container
with the maximum amount of water.
'''

# Approach: Two Pointer

class Solution:
    def maxArea(self, height):
        left, right = 0, len(height) - 1
        max_water = 0

        while left < right:
            width = right - left
            water = min(height[left], height[right]) * width
            max_water = max(max_water, water)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_water