// Last updated: 7/9/2026, 3:05:25 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int n=x;
        while(x!=0){
            sum=sum+ x%10;
            x=x/10;
        }
            if(n%sum==0) return sum;
            else return -1;
        
    }
}