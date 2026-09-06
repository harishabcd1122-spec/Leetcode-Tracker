// Last updated: 9/6/2026, 10:19:29 PM
1class Solution {
2    TreeNode temp = null;
3
4    public void flatten(TreeNode root) {
5        helper(root);
6    }
7    private void helper(TreeNode root){
8        if(root == null) return;
9
10        TreeNode left = root.left;
11        TreeNode right = root.right;
12
13        if(temp != null){
14            temp.right = root;
15            
16        }
17
18        root.left = null;
19        temp = root;
20
21        helper(left);
22        helper(right);
23    }
24}