// Last updated: 7/9/2026, 3:10:51 PM
class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        if (x<0){
            return false;
        }
        int rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if (org==rev){
            return true;
        }else{
            return false;
        }
    }
}