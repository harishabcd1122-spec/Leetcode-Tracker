// Last updated: 8/28/2026, 9:57:36 AM
1class Solution {
2    public List<String> findWords(char[][] board, String[] words) {
3    List<String> res = new ArrayList<>();
4    TrieNode root = buildTrie(words);
5    for (int i = 0; i < board.length; i++) {
6        for (int j = 0; j < board[0].length; j++) {
7            dfs (board, i, j, root, res);
8        }
9    }
10    return res;
11}
12
13public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
14    char c = board[i][j];
15    if (c == '#' || p.next[c - 'a'] == null) return;
16    p = p.next[c - 'a'];
17    if (p.word != null) {   // found one
18        res.add(p.word);
19        p.word = null;     // de-duplicate
20    }
21
22    board[i][j] = '#';
23    if (i > 0) dfs(board, i - 1, j ,p, res); 
24    if (j > 0) dfs(board, i, j - 1, p, res);
25    if (i < board.length - 1) dfs(board, i + 1, j, p, res); 
26    if (j < board[0].length - 1) dfs(board, i, j + 1, p, res); 
27    board[i][j] = c;
28}
29
30public TrieNode buildTrie(String[] words) {
31    TrieNode root = new TrieNode();
32    for (String w : words) {
33        TrieNode p = root;
34        for (char c : w.toCharArray()) {
35            int i = c - 'a';
36            if (p.next[i] == null) p.next[i] = new TrieNode();
37            p = p.next[i];
38       }
39       p.word = w;
40    }
41    return root;
42}
43
44class TrieNode {
45    TrieNode[] next = new TrieNode[26];
46    String word;
47}
48}