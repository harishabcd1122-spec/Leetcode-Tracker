// Last updated: 9/28/2026, 9:06:40 PM
1class Solution {
2    public int findPeakElement(int[] nums) 
3    {
4     int max = Integer.MIN_VALUE;
5     int max_index = 0;
6     for(int i=0;i<nums.length;i++)
7     {
8      if(nums[i]>max)  
9      {
10        max = nums[i];
11        max_index = i;
12      }
13     } 
14     return max_index;  
15    }
16}