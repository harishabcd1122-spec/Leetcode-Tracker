// Last updated: 9/25/2026, 12:57:26 PM
class Solution {
    private Map<Integer, Integer> inorderIndexes = new HashMap<>();
    private int i_post;

    private TreeNode solve(int[] postorder, int[] inorder, int start, int end) {
        if (start > end || i_post < 0)
            return null;

        TreeNode node = new TreeNode(postorder[i_post]);

        int i_in = inorderIndexes.get(postorder[i_post]);

        i_post--;

        node.right = solve(postorder, inorder, i_in + 1, end);
        node.left = solve(postorder, inorder, start, i_in - 1);

        return node;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++)
            inorderIndexes.put(inorder[i], i);

        i_post = postorder.length - 1;

        return solve(postorder, inorder, 0, inorder.length - 1);
    }
}