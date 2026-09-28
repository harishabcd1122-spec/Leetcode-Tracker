// Last updated: 9/28/2026, 8:36:50 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3       int n = nums.length;
4       int max = Integer.MIN_VALUE;
5       int count = 0;
6       for(int val : nums){
7        if(val == 1){
8            count++;
9        }
10        else{
11            count = 0;
12        }
13
14        if(count > max){
15            max = count;
16        }
17       }
18       return max;
19    }
20}