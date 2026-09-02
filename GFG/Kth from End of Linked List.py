# GFG: Kth from End of Linked List
'''
Given a linked list and an integer k, find the kth node from the end.
'''

# Approach: Two Pointer

class Solution:
    def getKthFromLast(self, head, k):
        fast = slow = head

        for _ in range(k):
            if fast is None:
                return -1
            fast = fast.next

        while fast:
            slow = slow.next
            fast = fast.next

        return slow.data