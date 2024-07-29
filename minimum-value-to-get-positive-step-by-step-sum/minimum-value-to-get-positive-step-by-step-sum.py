class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        min_val = 0
        total = 0

        # Iterate over the array and get the minimum step-by-step total.
        for num in nums:
            total += num
            min_val = min(min_val, total)

        return abs(min_val) + 1