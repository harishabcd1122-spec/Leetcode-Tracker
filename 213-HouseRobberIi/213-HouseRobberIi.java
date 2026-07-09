// Last updated: 7/9/2026, 3:07:40 PM
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int max1=0,max2=0,a=0,b=0;
        for(int i=0;i<nums.length-1;i++){
            max1=Math.max(a,b+nums[i]);
            b=a;
            a=max1;
        }
        int c=0;
        int d=0;
        for(int i=nums.length-1;i>=1;i--){
            
            max2=Math.max(c,d+nums[i]);
            d=c;
            c=max2;
        }
        
        if(max1>max2) return max1;
        else return max2;
    }
}