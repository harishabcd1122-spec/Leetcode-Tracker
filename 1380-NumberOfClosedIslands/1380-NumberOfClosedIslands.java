// Last updated: 7/9/2026, 3:06:10 PM
class Solution {
     void travel(int[][] grid, int row, int col) {
        if (row<0||row>=grid.length||col < 0 || col >= grid[0].length ||grid[row][col] == 1) return;
        grid[row][col] = 1;
        travel(grid, row, col + 1);
        travel(grid, row, col - 1);
        travel(grid, row + 1, col);
        travel(grid, row - 1, col);
    }
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int j=0; j<cols; j++){
             if (grid[0][j] == 0) travel(grid, 0, j);
            if (grid[rows - 1][j] == 0) travel(grid, rows - 1, j);
        } for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) travel(grid, i, 0);
            if (grid[i][cols - 1] == 0) travel(grid, i, cols - 1);
        } int count = 0;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (grid[i][j] == 0) {
                    count++;
                    travel(grid, i, j);
                }
            }
        }
        return count;     
    }
}