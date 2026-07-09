// Last updated: 7/9/2026, 3:07:49 PM
class Solution {
    void travel(char[][]grid,int row,int col){
        if(col >= grid[0].length || col<0 ||row<0 ||row>=grid.length || grid[row][col]=='0') return;
        grid[row][col]='0';
        travel(grid,row,col+1);
        travel(grid,row,col-1);
        travel(grid,row-1,col);
        travel(grid,row+1,col);
    }
    public int numIslands(char[][] grid) {
        int c=0,row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    c++;
                    travel(grid,i,j);
                
                }
            }
        }
        return c;
    }
}