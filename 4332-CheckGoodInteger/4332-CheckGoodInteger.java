// Last updated: 7/9/2026, 3:05:12 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0,ssum=0;
        while(n>0){
            int digit=n%10;
            ds+=digit;
            ssum+=digit*digit;
            n=n/10;
            
        
            
        
        }
        return (ssum-ds)>=50;
    }
}