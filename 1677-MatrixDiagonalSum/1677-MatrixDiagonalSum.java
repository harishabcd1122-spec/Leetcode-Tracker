// Last updated: 7/9/2026, 3:06:02 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int psum=0;
        int ssum=0;
        int sum;
        for(int i=0;i<n;i++){
                psum+=mat[i][i];
                ssum+=mat[i][n-i-1];   
        }
        sum=psum+ssum;
        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
        
    }
}