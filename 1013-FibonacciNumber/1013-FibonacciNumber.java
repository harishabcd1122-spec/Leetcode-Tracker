// Last updated: 7/9/2026, 3:06:31 PM
class Solution {
    public int f(int m){
        if(m<=1) return m;
        int i=0,j=1;
        for(int l=2;l<=m;l++){
            int k=i+j;
            i=j;
            j=k;
        }
        return j;
        
    }
    public int fib(int n) {
        return f(n);
    }
}