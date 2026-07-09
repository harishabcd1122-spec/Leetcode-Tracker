// Last updated: 7/9/2026, 3:07:34 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        for(int i=0;i<=32;i++){
            if((n&1)==1){
                c++;
            }
            n=n>>1;
        }
        if (c==1){
            return true;
        }else {
            return false;
        }
    }
}