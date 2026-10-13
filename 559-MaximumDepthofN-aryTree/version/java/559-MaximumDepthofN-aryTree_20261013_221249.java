// Last updated: 10/13/2026, 10:12:49 PM
1class Solution {
2    public int maxDepth(Node root) {
3        if(root == null) return 0;
4
5        int maxHeight = 0;
6        for(Node child : root.children){
7            maxHeight = Math.max(maxHeight, maxDepth(child));
8        }
9
10        return 1 + maxHeight;
11    }
12}