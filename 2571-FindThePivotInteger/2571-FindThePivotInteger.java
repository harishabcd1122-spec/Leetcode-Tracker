// Last updated: 7/9/2026, 3:05:42 PM
class Solution {
    public int pivotInteger(int n) {
       int total=(n*(n+1))/2;
       int ls=0;
       for (int x=1;x<=n;x++){
        ls+=x;
        int rs=total-ls+x;
        if(ls==rs) return x;
       }
       return -1;
    }
}