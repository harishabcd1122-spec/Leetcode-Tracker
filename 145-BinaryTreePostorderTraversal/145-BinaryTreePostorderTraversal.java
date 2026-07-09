// Last updated: 7/9/2026, 3:08:32 PM
class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return result;
    }

    public void postorder(TreeNode node) {
        if (node == null) {
            return;
        }

        postorder(node.left);      
        postorder(node.right);    
        result.add(node.val);      
    }
}