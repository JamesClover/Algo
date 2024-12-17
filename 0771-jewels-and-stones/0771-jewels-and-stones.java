class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet();
        char[] charJewels = jewels.toCharArray();
        char[] charStones = stones.toCharArray();

        for (char c : charJewels) {
            set.add(c);
        }

        for (char c: charStones) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }
}