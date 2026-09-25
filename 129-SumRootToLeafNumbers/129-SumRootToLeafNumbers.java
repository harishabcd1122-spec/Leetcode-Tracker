// Last updated: 9/25/2026, 12:56:33 PM
class Solution {
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    void helper(TreeNode node, int path) {
        if (node == null) return;
        path = path * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += path;
        }
        helper(node.left, path);
        helper(node.right, path);
    }
}