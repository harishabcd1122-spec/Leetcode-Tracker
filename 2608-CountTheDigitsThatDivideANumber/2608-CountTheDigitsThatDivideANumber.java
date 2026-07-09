// Last updated: 7/9/2026, 3:05:39 PM
class Solution {
    public int countDigits(int num) {
        int digit,count=0;
        int original=num;
        while(num!=0){
            digit=num%10;
            if(original%digit==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}