// Last updated: 7/9/2026, 3:08:27 PM
class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid=(s+e)/2;  
            if(nums[e]<nums[mid]) s=mid+1;
            else e=mid;
        }
        return nums[e];
    }
}