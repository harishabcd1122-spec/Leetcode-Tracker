// Last updated: 7/9/2026, 3:05:24 PM
class Solution {
    public int minimumOperations(int[] n) {
        int c=0;
        for (int i=0;i<n.length;i++){
            if(n[i]%3!=0)  c++;
            
        }
        return c;
        
    }
}