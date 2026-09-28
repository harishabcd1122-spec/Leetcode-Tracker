// Last updated: 9/28/2026, 8:36:19 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4
5        // traverse from end
6        for (int i = s.length() - 1, count = 0; i >= 0; i--) {
7            char c = s.charAt(i);
8
9            if (c == '-') continue;
10
11            if (count == k) {
12                sb.append('-');
13                count = 0;
14            }
15
16            sb.append(Character.toUpperCase(c));
17            count++;
18        }
19
20        return sb.reverse().toString();
21    }
22}