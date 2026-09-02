# GFG: Stack using Linked List
'''
Implement a stack using a linked list.
Support push, pop, peek, isEmpty and size operations.
'''

# Approach: Linked List

class Node:
    def __init__(self, x):
        self.data = x
        self.next = None


class myStack:
    def __init__(self):
        self.top = None
        self.count = 0

    def push(self, x):
        new_node = Node(x)
        new_node.next = self.top
        self.top = new_node
        self.count += 1

    def pop(self):
        if self.top is None:
            return -1

        value = self.top.data
        self.top = self.top.next
        self.count -= 1
        return value

    def peek(self):
        if self.top is None:
            return -1
        return self.top.data

    def isEmpty(self):
        return self.top is None

    def size(self):
        return self.count