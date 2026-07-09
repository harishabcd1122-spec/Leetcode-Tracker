// Last updated: 7/9/2026, 3:05:27 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int d=0;
        int nd=0;
        for(int i=0;i<=n;i++){
            if(i%m==0){
                d+=i;

            }else{
                nd+=i;
            }
        }
        return nd-d;
        
    }
}