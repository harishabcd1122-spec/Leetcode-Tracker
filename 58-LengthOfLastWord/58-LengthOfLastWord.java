// Last updated: 7/9/2026, 3:09:39 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}