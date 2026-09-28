// Last updated: 9/28/2026, 8:50:06 PM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        return recWay1(s, wordDict);
4    }
5
6    boolean recWay2(String s, List<String> wordDict) {
7        Boolean[] memo = new Boolean[s.length() + 1];
8        return wordBreak2(s, new HashSet<>(wordDict), 0, memo);
9    }
10
11    boolean wordBreak2(String s, Set<String> wordDict, int k, Boolean[] memo) {
12        int n = s.length();
13        if (k == n) return true;
14
15        if (memo[k] != null) return memo[k];
16
17        for (int i=k + 1; i<=n; i++) {
18            String word = s.substring(k, i);
19            if (wordDict.contains(word) && wordBreak2(s, wordDict, i, memo)) {
20                return memo[k] = true;
21            }
22        }
23
24        return memo[k] = false;
25    }
26
27    boolean recWay1(String s, List<String> wordDict) {
28        Boolean[] memo = new Boolean[s.length() + 1];
29        return wordBreak(s, wordDict, 0, memo);
30    }
31    
32    boolean wordBreak(String s, List<String> wordDict, int k, Boolean[] memo) {
33        if (k == s.length()) {
34            return true;
35        }
36        
37        if (memo[k] != null) {
38            return memo[k];
39        }
40        
41        for (int i=0; i<wordDict.size(); i++) {
42            String word = wordDict.get(i);
43            if (s.startsWith(word, k)) {
44                if(wordBreak(s, wordDict, k + word.length(), memo)) return memo[k] = true;
45            }
46        }
47                   
48        return memo[k] = false;
49    }
50}