// Last updated: 7/13/2026, 10:27:57 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap<Character, Character> charMap = new HashMap<>();
4
5        for (int i = 0; i < s.length(); i++) {
6            char sc = s.charAt(i);
7            char tc = t.charAt(i);
8
9            if (charMap.containsKey(sc)) {
10                if (charMap.get(sc) != tc) {
11                    return false;
12                }
13            } else if (charMap.containsValue(tc)) {
14                return false;
15            }
16
17            charMap.put(sc, tc);
18        }
19
20        return true;        
21    }
22}