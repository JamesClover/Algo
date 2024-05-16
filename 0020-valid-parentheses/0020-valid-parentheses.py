class Solution:
    def isValid(self, s: str) -> bool:
        # create a map, mapping open brackets to close brackets
        # iterate through the string
        # if its an open bracket, add to stack
        # if it's a close bracket, if top of stack isn't that open bracket
        # false
        # else continue

        mmap = {"(": ")", "[": "]", "{": "}"}

        stack = []

        for char in s:
            if char in mmap:
                stack.append(char)
            else:
                if not stack:
                    return False
                  

                if mmap[stack.pop()] != char:
                    return False
        
        return len(stack) == 0
     