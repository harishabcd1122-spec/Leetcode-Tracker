// Last updated: 9/25/2026, 12:50:46 PM
class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int mid;
        while(i<=j)
        {
            mid=(i+j)/2;
            if(nums[mid]==target)
             return mid;
            else if(nums[mid]<target)
             i=mid+1;
            else
             j=mid-1;
        }
        return -1;
    }
}