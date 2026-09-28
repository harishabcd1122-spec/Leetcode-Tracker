// Last updated: 9/28/2026, 8:30:06 PM
1class Solution {
2    public List<Double> averageOfLevels(TreeNode root) {
3        List<Double> res = new ArrayList<>();
4        if (root == null) return res;
5
6        Queue<TreeNode> queue = new LinkedList<>();
7        queue.add(root);
8
9        while (!queue.isEmpty()) {
10            int level = queue.size();
11            double sum = 0.0;
12
13            for (int i = 0; i < level; i++) {
14                TreeNode curr = queue.poll();
15                sum += curr.val;
16                if (curr.left != null) queue.offer(curr.left);
17                if (curr.right != null) queue.offer(curr.right);
18            }
19
20            res.add(sum / level);
21        }
22
23        return res;
24    }
25}