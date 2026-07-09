// Last updated: 7/9/2026, 3:10:11 PM
class Solution {
    public int search(int[] nums, int target) {
        int e=nums.length-1;
        for(int i=0;i<=e;i++){
            if (nums[i]==target){
                return i;
            }
            
        }
        return -1;
        
    }
}