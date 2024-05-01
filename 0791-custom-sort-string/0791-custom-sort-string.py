class Solution:
    def customSortString(self, order: str, s: str) -> str:
        count = {}
        res = []
        rest = []

        # Count the occurrence of characters in order
        for char in order:
            count[char] = 0

        # Count the occurrences of characters in s
        for char in s:
            if char in count:
                count[char] += 1
            else:
                rest.append(char)

        # Sort the characters based on their order in order
        for char in order:
            res.extend(char * count[char])

        # Sort the remaining characters lexicographically
        rest.sort()
        res.extend(rest)

        return "".join(res)
