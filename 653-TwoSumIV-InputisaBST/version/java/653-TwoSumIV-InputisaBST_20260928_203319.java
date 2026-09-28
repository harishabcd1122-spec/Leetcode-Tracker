// Last updated: 9/28/2026, 8:33:19 PM
1class Solution {
2    HashSet<Integer> set = new HashSet<>();
3
4    public boolean findTarget(TreeNode root, int k) {
5        // Base case: null node
6        if (root == null) return false;
7
8        // If complement is found, return true
9        if (set.contains(k - root.val)) return true;
10
11        // Otherwise, add current node value to the set
12        set.add(root.val);
13
14        // Recurse on left and right subtrees
15        return findTarget(root.left, k) || findTarget(root.right, k);
16    }
17}