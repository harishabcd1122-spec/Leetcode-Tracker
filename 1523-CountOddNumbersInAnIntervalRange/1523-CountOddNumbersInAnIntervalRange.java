// Last updated: 9/25/2026, 12:49:40 PM
class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2==0)
         low++;
        for(int i=low;i<=high;i=i+2)
            count++;
        return count;
    }
}