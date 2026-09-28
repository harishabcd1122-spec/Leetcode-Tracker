// Last updated: 9/28/2026, 8:30:48 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n = nums.length;
4        int sum = 0;
5        for (int i = 0; i < k; i++) {
6            sum += nums[i];
7        }
8        int maxSum = sum;
9        for (int i = k; i < n; i++) {
10            sum = sum - nums[i - k] + nums[i];
11            if (sum > maxSum) {
12                maxSum = sum;
13            }
14        }
15        return (double) maxSum / k;
16    }
17}