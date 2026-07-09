// Last updated: 7/9/2026, 3:05:10 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum=0;
        int cm=mul;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            sum+=Math.max(nums[i],(long)nums[i]*cm);
            cm--;
        }
        return sum;
    }
}