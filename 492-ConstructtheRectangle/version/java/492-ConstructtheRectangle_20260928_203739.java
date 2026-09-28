// Last updated: 9/28/2026, 8:37:39 PM
1class Solution {
2    public int[] constructRectangle(int area) {
3        int W = (int) Math.sqrt(area);
4        
5        while (area % W != 0) {
6            W--;
7        }
8        
9        int L = area / W;
10        
11        return new int[]{L, W};
12    }
13}