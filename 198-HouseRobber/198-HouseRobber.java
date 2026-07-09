// Last updated: 7/9/2026, 3:07:51 PM
class Solution {
    public int rob(int[] nums) {
        int max=0,a=0,b=0;
        for(int i:nums){
            max=Math.max(a,b+i);
            b=a;
            a=max;
        }
        return max;
    }
}