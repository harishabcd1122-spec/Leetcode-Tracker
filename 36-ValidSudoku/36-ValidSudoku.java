// Last updated: 7/9/2026, 3:10:06 PM
class Solution {
    public boolean check(char[][] board,int row,int col) {
       
        for(int i=0;i<9;i++){
            if(i !=col && board[row][col]==board[row][i]) return false;
            if(i !=row && board[row][col]==board[i][col]) return false;
        }
        int st_row=(row/3)*3;
        int st_col=(col/3)*3;
        for(int i=st_row;i<st_row+3;i++){
            for(int j=st_col;j<st_col+3;j++){
                if(i!=row && j!=col){
                    if(board[i][j]==board[row][col]) return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!check(board,i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}