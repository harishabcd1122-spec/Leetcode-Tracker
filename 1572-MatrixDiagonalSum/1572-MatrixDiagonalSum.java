// Last updated: 9/25/2026, 12:49:31 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0,n=0;
        n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
              if(i==j||i+j==n-1)
              sum1=sum1+mat[i][j];
            }
        }
         return sum1;
    }
}