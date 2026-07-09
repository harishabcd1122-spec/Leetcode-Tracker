// Last updated: 7/9/2026, 3:06:04 PM
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;;
        while(empty>=NE){
            int newD=empty/NE;
            empty=(empty%NE)+newD;
            drink+=newD;
        }
        return drink;
    }
}