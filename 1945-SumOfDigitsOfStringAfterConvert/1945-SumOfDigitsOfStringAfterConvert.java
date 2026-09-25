// Last updated: 9/25/2026, 12:49:23 PM
class Solution {
    public int SUM(int num){
        int sum=0;
        while(num!=0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
    public int getLucky(String s, int k) {
        int sum=0;
        for(char ch:s.toCharArray()){
            int val=ch-'a'+1;
            sum+=SUM(val);
        }
        for(int i=1;i<k;i++){
            sum=SUM(sum);
        }
        return sum;
    }
}