class Solution {
    public String getSmallestString(String s) {
         char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            int curr = charArray[i] - '0';
            int next = charArray[i + 1] - '0';

            // Check if both are even or both are odd
            if ((curr % 2 == 0 && next % 2 == 0) || (curr % 2 != 0 && next % 2 != 0)) {
                if (curr > next) {
                    // Perform swap
                    char temp = charArray[i];
                    charArray[i] = charArray[i + 1];
                    charArray[i + 1] = temp;
                    break;
                }
            }
        }
        return new String(charArray);
    }
}
