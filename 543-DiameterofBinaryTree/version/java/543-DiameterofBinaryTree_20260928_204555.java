// Last updated: 9/28/2026, 8:45:55 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int diameter;
18
19    public int diameterOfBinaryTree(TreeNode root) {
20        diameter = 0;
21        solve(root);
22        return diameter;
23    }
24
25    private int solve(TreeNode root) {
26        if (root == null) return 0;
27
28        int leftHeight = solve(root.left);
29        int rightHeight = solve(root.right);
30
31        diameter = Math.max(diameter, leftHeight + rightHeight);
32
33        return Math.max(leftHeight, rightHeight) + 1;
34    }
35}