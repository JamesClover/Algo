class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        
        newArray = []
        
        for num in nums:
            newArray.append(num * num)
            
        
        return sorted(newArray)
        