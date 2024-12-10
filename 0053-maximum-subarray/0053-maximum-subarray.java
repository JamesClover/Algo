class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int currValue = 0;

        for (int num : nums) {
            currValue += num;
            maxValue = Math.max(maxValue, currValue);

            if (currValue < 0) {
                currValue = 0;
            }
        }

        return maxValue;
    }
}