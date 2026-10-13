// Last updated: 10/13/2026, 10:14:28 PM
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3    Set seen = new HashSet(), repeated = new HashSet();
4    for (int i = 0; i + 9 < s.length(); i++) {
5        String ten = s.substring(i, i + 10);
6        if (!seen.add(ten))
7            repeated.add(ten);
8    }
9    return new ArrayList(repeated);
10}
11}