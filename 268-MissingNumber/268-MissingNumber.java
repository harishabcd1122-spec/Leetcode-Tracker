// Last updated: 7/9/2026, 3:07:22 PM
class Solution {
    public int missingNumber(int[] nums) {
        int av=0;
        for(int i=0;i<=nums.length;i++){
            av+=i;
        }
        int gv=0;
        for(int b: nums){
            gv += b;
        }
        return av-gv;
    }
}