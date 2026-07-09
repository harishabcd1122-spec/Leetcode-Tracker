// Last updated: 7/9/2026, 3:05:37 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int last,sum1=0,sum2=0;
        for(int x:nums){
            sum1+=x;
            int ori=x;
        
            while(ori!=0){
                sum2=sum2+ori%10;
                ori/=10;
            }
        }
        return sum1-sum2;
    }
}