// Last updated: 7/13/2026, 10:26:03 PM
1class Solution {
2    int height(TreeNode root) {
3        return root == null ? -1 : 1 + height(root.left);
4    }
5    public int countNodes(TreeNode root) {
6        int h = height(root);
7        return h < 0 ? 0 :
8               height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
9                                         : (1 << h-1) + countNodes(root.left);
10    }
11}