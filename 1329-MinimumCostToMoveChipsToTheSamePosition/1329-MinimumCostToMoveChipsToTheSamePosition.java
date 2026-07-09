// Last updated: 7/9/2026, 3:06:15 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int p:position){
            if(p%2==0)  even++;
            else  odd++ ;
        }
        if(even<odd) return even;
        else return odd;
    }

}