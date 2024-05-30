from collections import defaultdict

class Solution:
    def largestUniqueNumber(self, nums: List[int]) -> int:

        freq = defaultdict(int)

        for num in nums:
            freq[num] += 1

        
        currHighest = -1

        for key, val in freq.items():
            if val == 1:
                if key > currHighest:
                    currHighest = key

        return currHighest
        