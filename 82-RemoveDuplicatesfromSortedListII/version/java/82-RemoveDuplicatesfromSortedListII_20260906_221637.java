// Last updated: 9/6/2026, 10:16:37 PM
1class Solution {
2    int index = 0; // tracks position in preorder
3
4    public TreeNode buildTree(int[] preorder, int[] inorder) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for (int i = 0; i < inorder.length; i++) {
7            map.put(inorder[i], i); // map inorder value to its index
8        }
9        return helper(preorder, 0, inorder.length - 1, map);
10    }
11
12    private TreeNode helper(int[] preorder, int start, int end, HashMap<Integer, Integer> map) {
13        if (start > end) return null;
14
15        int rootVal = preorder[index++];
16        TreeNode node = new TreeNode(rootVal);
17
18        int inorderIndex = map.get(rootVal);
19
20        node.left = helper(preorder, start, inorderIndex - 1, map);
21        node.right = helper(preorder, inorderIndex + 1, end, map);
22
23        return node;
24    }
25}