// Last updated: 9/25/2026, 12:54:22 PM
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==0)
         return false;
        while(n%2==0)
         n=n/2;
        if(n==1)
         return true;
         else
         return false;
    }
};