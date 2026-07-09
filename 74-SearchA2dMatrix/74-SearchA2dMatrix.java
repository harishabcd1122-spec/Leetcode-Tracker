// Last updated: 7/9/2026, 3:09:25 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int s=0;
       int row=matrix.length;
       int col=matrix[0].length;
       int e=row*col-1;
       while(s<=e){
        int mid=(s+e)/2;
        int val=matrix[mid/col][mid%col];
        if(val==target) return true;
        if(val>target) e=mid-1;
        else s=mid+1;
       } 
       return false;
    }
}