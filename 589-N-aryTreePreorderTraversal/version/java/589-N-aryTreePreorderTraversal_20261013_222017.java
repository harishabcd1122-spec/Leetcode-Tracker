// Last updated: 10/13/2026, 10:20:17 PM
1class Solution {
2    List<Integer> ans = new ArrayList<>();
3    public List<Integer> preorder(Node root) {
4        if (root == null) return ans;
5        ans.add(root.val);
6        for (Node child : root.children)
7            preorder(child);
8        return ans;
9    }
10}