// Last updated: 9/25/2026, 12:49:35 PM
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;
        int s=0;
        while(empty>=NE)
        {
         s=empty/NE;
         drink=drink+s;
         empty=(empty%NE)+s;
        }
        return drink;
    }
}