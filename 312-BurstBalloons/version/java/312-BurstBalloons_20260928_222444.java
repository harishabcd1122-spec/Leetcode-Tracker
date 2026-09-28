// Last updated: 9/28/2026, 10:24:44 PM
1class Solution {
2    public int maxCoins(int[] iNums) {
3    int[] nums = new int[iNums.length + 2];
4    int n = 1;
5    for (int x : iNums) if (x > 0) nums[n++] = x;
6    nums[0] = nums[n++] = 1;
7
8
9    int[][] memo = new int[n][n];
10    return burst(memo, nums, 0, n - 1);
11}
12
13public int burst(int[][] memo, int[] nums, int left, int right) {
14    if (left + 1 == right) return 0;
15    if (memo[left][right] > 0) return memo[left][right];
16    int ans = 0;
17    for (int i = left + 1; i < right; ++i)
18        ans = Math.max(ans, nums[left] * nums[i] * nums[right] 
19        + burst(memo, nums, left, i) + burst(memo, nums, i, right));
20    memo[left][right] = ans;
21    return ans;
22}
23}