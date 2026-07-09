// Last updated: 7/9/2026, 3:08:20 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
                if(nums[i]==nums[i+1]) count++;
                else count=1;
                if(count>n/2) return(nums[i]);
        
        }
        return nums[0];
    }
}