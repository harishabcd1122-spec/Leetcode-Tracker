// Last updated: 9/25/2026, 12:49:51 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,r=1;
        int d=0;
        while(n!=0)
        {
        d=n%10;
        s=s+d;
        r=r*d;
        n=n/10;
        }
        return r-s;

    }
}