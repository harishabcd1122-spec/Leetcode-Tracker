// Last updated: 9/28/2026, 10:23:03 PM
1class Solution {
2   public List<String> removeInvalidParentheses(String s) {
3    List<String> ans = new ArrayList<>();
4    remove(s, ans, 0, 0, new char[]{'(', ')'});
5    return ans;
6}
7
8public void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
9    for (int stack = 0, i = last_i; i < s.length(); ++i) {
10        if (s.charAt(i) == par[0]) stack++;
11        if (s.charAt(i) == par[1]) stack--;
12        if (stack >= 0) continue;
13        for (int j = last_j; j <= i; ++j)
14            if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
15                remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
16        return;
17    }
18    String reversed = new StringBuilder(s).reverse().toString();
19    if (par[0] == '(') // finished left to right
20        remove(reversed, ans, 0, 0, new char[]{')', '('});
21    else // finished right to left
22        ans.add(reversed);
23}
24}