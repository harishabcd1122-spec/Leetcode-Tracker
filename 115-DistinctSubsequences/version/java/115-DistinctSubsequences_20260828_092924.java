// Last updated: 8/28/2026, 9:29:24 AM
1class Solution {
2    public int numDistinct(String S, String T) {
3    // array creation
4    int[][] mem = new int[T.length()+1][S.length()+1];
5
6    // filling the first row: with 1s
7    for(int j=0; j<=S.length(); j++) {
8        mem[0][j] = 1;
9    }
10    
11    // the first column is 0 by default in every other rows but the first, which we need.
12    
13    for(int i=0; i<T.length(); i++) {
14        for(int j=0; j<S.length(); j++) {
15            if(T.charAt(i) == S.charAt(j)) {
16                mem[i+1][j+1] = mem[i][j] + mem[i+1][j];
17            } else {
18                mem[i+1][j+1] = mem[i+1][j];
19            }
20        }
21    }
22    
23    return mem[T.length()][S.length()];
24}
25}