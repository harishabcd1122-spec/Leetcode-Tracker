// Last updated: 8/28/2026, 9:20:05 AM
1class Solution {
2    private int getIndex(char ch) {
3        return ch >= 'a' && ch <= 'z' ? 
4            ch - 'a' : 
5            ch - 'A' + 26;
6    }
7
8    public int longestPalindrome(String s) {
9        boolean[] freq = new boolean[52];
10
11        int n = 0;
12
13        for (int i = 0; i < s.length(); i++) {
14            int index = getIndex(s.charAt(i));
15
16            if (freq[index]) {
17                freq[index] = false;
18                n++;
19            } else {
20                freq[index] = true;
21            }
22        }
23
24        return n * 2 == s.length() ? n * 2 : n * 2 + 1;
25    }
26}