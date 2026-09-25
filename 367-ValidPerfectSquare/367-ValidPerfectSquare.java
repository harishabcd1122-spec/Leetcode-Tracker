// Last updated: 9/25/2026, 12:53:09 PM
class Solution {
    public boolean isPerfectSquare(int num) {
       long i=1,j=num;
       long mid;
       while(i<=j)
       {
        mid=(i+j)/2;
       if(mid*mid==num) 
         return true;
        else if(mid*mid<num)
         i=mid+1;
        else 
         j=mid-1;
       }
        return false; 
    }
}