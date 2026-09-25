// Last updated: 9/25/2026, 12:52:00 PM
class Solution {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        
        while (area % W != 0) {
            W--;
        }
        
        int L = area / W;
        
        return new int[]{L, W};
    }
}