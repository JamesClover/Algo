class Solution {
    public void reverseString(char[] s) {
        int curr = 0;
        int n = s.length - 1;
        
        while (curr < n) {
            char temp = s[curr];
            s[curr] = s[n];
            s[n] = temp;
            
            curr += 1;
            n -= 1;
        }
        
    }
}