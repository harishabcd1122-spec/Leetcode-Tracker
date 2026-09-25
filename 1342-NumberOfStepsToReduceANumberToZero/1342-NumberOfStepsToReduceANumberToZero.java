// Last updated: 9/25/2026, 12:49:44 PM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0)
        {
         if(num%2==0)
          num=num/2;
         else
          num=num-1;
          c++;
       }
     return c;
    }
}