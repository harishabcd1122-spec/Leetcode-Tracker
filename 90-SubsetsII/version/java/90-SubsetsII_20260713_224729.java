// Last updated: 7/13/2026, 10:47:29 PM
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
17    TreeNode first,second,prev;
18    public void recoverTree(TreeNode root) {
19        inorder(root);
20        int temp=first.val;
21        first.val=second.val;
22        second.val=temp;
23    }
24    public void inorder(TreeNode node){
25        if(node==null) return;
26        inorder(node.left);
27        if(prev!=null && prev.val>node.val){
28            if(first==null) first=prev;
29            second=node;
30        }
31        prev=node;
32        inorder(node.right);
33    }
34}