// Last updated: 7/9/2026, 3:05:18 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int p1=Math.abs(x-z);
        int p2=Math.abs(y-z);
        if(p1<p2) return 1;
        else if(p1>p2) return 2;
        else return 0;
        
    }
}