// Last updated: 9/25/2026, 12:58:39 PM
class Solution {
    public boolean exist(char[][] board, String word) {

        char[] wordArr = word.toCharArray();

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == wordArr[0] && track(board, wordArr, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean track(char[][] board, char[] word, int i, int j, int idx) {

        if (idx == word.length) return true;

        if (i >= board.length || j >= board[0].length || j < 0 || i < 0) return false;

        if (board[i][j] != word[idx]) return false;

        char temp = board[i][j];
        board[i][j] = '#';
        
        boolean found = track(board, word, i, j + 1, idx + 1) || 
        track(board, word, i + 1, j, idx + 1) || 
        track(board, word, i, j - 1, idx + 1) || 
        track(board, word, i - 1, j, idx + 1);

        board[i][j] = temp;

        return found;
    }
}