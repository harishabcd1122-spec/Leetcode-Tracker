// Last updated: 9/25/2026, 12:57:37 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> ans=new ArrayList<>();
        Queue <TreeNode> q=new LinkedList<>();
        int x=0;
        if(root==null)
         return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> temp=new ArrayList<>();
            int m=q.size();

            for(int i=0;i<m;i++)
            {
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            if(x%2!=0)
             Collections.reverse(temp);
            ans.add(temp);
            x++;
        }
        return ans;
    }
   
}
