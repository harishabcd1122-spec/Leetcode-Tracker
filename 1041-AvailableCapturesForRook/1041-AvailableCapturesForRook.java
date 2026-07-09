// Last updated: 7/9/2026, 3:06:30 PM
class Solution {
    public int numRookCaptures(char[][] board) {
        int attack=0;
        int row=0; 
        int col=0;
        for(int i=0;i<=7;i++){
            for(int j=0;j<=7;j++){
                if(board[i][j]=='R'){
                    row=i;
                    col=j;
                    break;

                }
            }
        }
        int r=row;
        int c=col;
        while(r>=0 && board[r][c]!='B'){
            if (board[r][c]=='p'){
                attack++;
                break;
            }
            r--;
        }
        r=row;
        c=col;
        while(r<=7 && board[r][c]!='B'){
            if (board[r][c]=='p'){
                attack++;
                break;
            }
            r++;
        }
        r=row;
        c=col;
        while(c>=0 && board[r][c]!='B'){
            if (board[r][c]=='p'){
                attack++;
                break;
            }c--;
        }
        r=row;
        c=col;
        while(c<=7 && board[r][c]!='B'){
            if(board[r][c]=='p'){
            attack++;
            break;
        }  
        c++;}
        return attack;
    }
}