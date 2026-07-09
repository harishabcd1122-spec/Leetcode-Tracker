// Last updated: 7/9/2026, 3:08:17 PM
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0){
            n/=5;
            c+=n;
        }
        return c;
    }

}