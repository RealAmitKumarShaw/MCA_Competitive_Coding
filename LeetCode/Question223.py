# LeetCode Q223: Rectangle Area
'''
Given two axis-aligned rectangles, return the total area
covered by both rectangles.
'''

# Approach: Calculate Overlap

class Solution(object):
    def computeArea(self, ax1, ay1, ax2, ay2, bx1, by1, bx2, by2):
        area1 = (ax2 - ax1) * (ay2 - ay1)
        area2 = (bx2 - bx1) * (by2 - by1)

        overlap_width = max(0, min(ax2, bx2) - max(ax1, bx1))
        overlap_height = max(0, min(ay2, by2) - max(ay1, by1))

        return area1 + area2 - overlap_width * overlap_height