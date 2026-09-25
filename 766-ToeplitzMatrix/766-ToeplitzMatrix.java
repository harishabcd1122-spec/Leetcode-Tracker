// Last updated: 9/25/2026, 12:50:49 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        int l=0;
        l=mat.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<mat[i].length-1;j++)
            {
                if(mat[i][j]!=mat[i+1][j+1])
                return false;;
            }
        }
        return true;
    }
}