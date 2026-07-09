// Last updated: 7/9/2026, 3:06:08 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1;
        while(n!=0){
            sum+=n%10;
            mul*=n%10;
            n=n/10;
        }
        return mul-sum;
    }
}