class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        char[] arr = s.toCharArray();
        int maxLen = 0;
        Set<Character> set = new HashSet<>();

        while (right < arr.length) {
            if (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            } else {
                set.add(arr[right]);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }

        }
        return maxLen;
    }
}