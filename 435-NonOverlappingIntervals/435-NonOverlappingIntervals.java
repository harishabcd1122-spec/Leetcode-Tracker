// Last updated: 7/9/2026, 3:07:04 PM
class Solution {
    public int eraseOverlapIntervals(int[][] it) {
        Arrays.sort(it,(a,b)->a[1] - b[1]);
        
        int count=0,end=Integer.MIN_VALUE;
        for(int[] i: it){
            if(end>i[0]) count++;
            else end=i[1];            
            }
            
        
        return count;
    }
}