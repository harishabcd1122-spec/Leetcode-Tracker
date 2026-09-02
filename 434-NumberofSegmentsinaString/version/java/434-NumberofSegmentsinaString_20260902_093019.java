// Last updated: 9/2/2026, 9:30:19 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4        List<List<Integer>> res = new ArrayList<>();
5
6        dfs(candidates, target, 0, new ArrayList<Integer>(), res);
7        return res;
8    }
9
10    private void dfs(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res) {
11        if (target < 0) {
12            return;
13        }
14
15        if (target == 0) {
16            res.add(new ArrayList<Integer>(comb));
17            return;
18        }
19
20        for (int i = start; i < candidates.length; i++) {
21            if (i > start && candidates[i] == candidates[i-1]) {
22                continue;
23            }
24
25            if (candidates[i] > target) {
26                break;
27            }
28
29            comb.add(candidates[i]);
30            dfs(candidates, target - candidates[i], i + 1, comb, res);
31            comb.remove(comb.size() - 1);
32        }
33    }
34}