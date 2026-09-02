// Last updated: 9/2/2026, 9:35:00 AM
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        Arrays.sort(nums);
4
5        List<List<Integer>> list = new ArrayList<>();
6        boolean[] visited = new boolean[nums.length];
7
8        backtracking(nums, new ArrayList<>(), list, visited);
9
10        return list;
11    }
12
13    public static void backtracking(int[] nums, List<Integer> currList,
14                                    List<List<Integer>> list, boolean[] visited) {
15
16        if (currList.size() == nums.length) {
17            list.add(new ArrayList<>(currList));
18            return;
19        }
20
21        for (int i = 0; i < nums.length; i++) {
22
23            if (visited[i]) {
24                continue;
25            }
26
27            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
28                continue;
29            }
30
31            visited[i] = true;
32            currList.add(nums[i]);
33
34            backtracking(nums, currList, list, visited);
35
36            currList.remove(currList.size() - 1);
37            visited[i] = false;
38        }
39    }
40}