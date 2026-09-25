// Last updated: 9/25/2026, 12:49:56 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0||n==1)
         return n;
        if(n==2)
         return 1;
        int p1=0,p2=1,p3=1,next=0;
        for(int i=1;i<=n-2;i++)
        {
            next=p1+p2+p3;
            p1=p2;
            p2=p3;
            p3=next;
        }
        return next;

    }
}