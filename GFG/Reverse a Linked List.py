# GFG: Reverse a Linked List
'''
Given a linked list, reverse the list and return the new head.
'''

# Approach: Three Pointer

class Solution:
    def reverseList(self, head):
        prev = None
        curr = head

        while curr:
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node

        return prev