// Last updated: 9/28/2026, 9:02:23 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> levelOrderBottom(TreeNode root) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        if (root == null) {
8            return result;
9        }
10
11        Deque<TreeNode> queue = new ArrayDeque<>();
12        queue.offer(root);
13
14        while (!queue.isEmpty()) {
15            int levelSize = queue.size();
16
17            List<Integer> level = new ArrayList<>(levelSize);
18
19            for (int i = 0; i < levelSize; i++) {
20                TreeNode curr = queue.poll();
21
22                level.add(curr.val);
23
24                if (curr.left != null) {
25                    queue.offer(curr.left);
26                }
27
28                if (curr.right != null) {
29                    queue.offer(curr.right);
30                }
31            }
32
33            result.add(level);
34        }
35
36        // Convert top-down order to bottom-up order
37        Collections.reverse(result);
38
39        return result;
40    }
41}