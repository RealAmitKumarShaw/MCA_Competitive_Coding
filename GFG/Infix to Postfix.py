# GFG: Infix to Postfix
'''
Given an infix expression, convert it into its postfix expression.
'''

# Approach: Stack

class Solution:
    def infixToPostfix(self, s):
        stack = []
        result = []

        def priority(ch):
            if ch == '^':
                return 3
            if ch == '*' or ch == '/':
                return 2
            if ch == '+' or ch == '-':
                return 1
            return 0

        for ch in s:
            if ch.isalnum():
                result.append(ch)

            elif ch == '(':
                stack.append(ch)

            elif ch == ')':
                while stack and stack[-1] != '(':
                    result.append(stack.pop())
                stack.pop()

            else:
                while (stack and stack[-1] != '(' and
                       (priority(stack[-1]) > priority(ch) or
                        (priority(stack[-1]) == priority(ch) and ch != '^'))):
                    result.append(stack.pop())

                stack.append(ch)

        while stack:
            result.append(stack.pop())

        return ''.join(result)
        