class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
    int maxOnesIdx = 0;
        int maxOnesCount = 0;
        // ToDo: Write Your Code Here.
        // iterate over the matrix
        // count the ones in each row
        // if that count of ones is greater than our current count
        // update the maxonescount 
        // and update the found index to be the min value of the current row and current index
        // return the array
        for (int i = 0; i < mat.length; i++) {
            int[] col = mat[i];
            int onesInRow = 0;
            for (int j = 0; j < col.length; j++) {
                int element = col[j];
                if (element == 1) {
                    onesInRow++;
                }
            }
            if (onesInRow > maxOnesCount) {
                maxOnesCount = onesInRow;
                maxOnesIdx = i;
            }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }
}