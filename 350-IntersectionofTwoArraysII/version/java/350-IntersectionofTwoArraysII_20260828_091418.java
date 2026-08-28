// Last updated: 8/28/2026, 9:14:18 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        if (ransomNote.length() > magazine.length()) {
4            return false;
5        }
6
7        Set<Character> ransomSet = new HashSet<>();
8        for (char c : ransomNote.toCharArray()) {
9            ransomSet.add(c);
10        }
11
12        for (char c : ransomSet) {
13            if (countOccurrences(magazine, c) < countOccurrences(ransomNote, c)) {
14                return false;
15            }
16        }
17        return true;
18    }
19
20    private int countOccurrences(String str, char c) {
21        return (int) str.chars().filter(ch -> ch == c).count();
22    }
23}