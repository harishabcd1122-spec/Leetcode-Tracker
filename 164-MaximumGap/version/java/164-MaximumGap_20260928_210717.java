// Last updated: 9/28/2026, 9:07:17 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        if(nums.length >= 2){
4        Arrays.sort(nums);
5        int maxValue = Integer.MIN_VALUE;
6      for(int i = 0; i<nums.length-1; i++){
7        if(Math.abs(nums[i] - nums[i+1]) > maxValue){
8            maxValue = Math.abs(nums[i] - nums[i+1]);
9        }
10         
11      }
12      return maxValue;
13    }
14    return 0;
15    }
16}