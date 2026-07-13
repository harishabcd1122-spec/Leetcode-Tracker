// Last updated: 7/13/2026, 10:33:37 PM
1class NumArray {
2
3    int[] prefixSum;
4
5    public NumArray(int[] nums) {
6        prefixSum = new int[nums.length];
7
8        prefixSum[0] = nums[0];
9
10        for (int i = 1; i < nums.length; i++)
11            prefixSum[i] = prefixSum[i - 1] + nums[i];
12    }
13
14    public int sumRange(int left, int right) {
15        if (left == 0)
16            return prefixSum[right];
17
18        return prefixSum[right] - prefixSum[left - 1];
19    }
20}