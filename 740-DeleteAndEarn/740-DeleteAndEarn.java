// Last updated: 7/9/2026, 3:06:39 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int dp[]=new int[10001];
        for(int i=0;i<nums.length;i++){
            dp[nums[i]]+=nums[i];
        }
        int max=0,a=0,b=0;
        for(int i:dp){
            max=Math.max(a,b+i);
            b=a;
            a=max;
        }
        return max;
    }
}