class Solution {
    public int[] sortedSquares(int[] nums) {

        // add them to an array list
        int[] squares = new int[nums.length];
        // iterate through the nums and square each value
        for (int i = 0; i < squares.length; i++) {
            squares[i] = nums[i] * nums[i];
        }
        // sort the newly formed array list
        Arrays.sort(squares);
        // return the sorted array
        return squares;
       
        
    }
}