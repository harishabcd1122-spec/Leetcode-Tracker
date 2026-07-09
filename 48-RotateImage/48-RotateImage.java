// Last updated: 7/9/2026, 3:09:47 PM
class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length, k = n - 1;
        for (int i = 0; i < n >> 1; i++)
            for (int j = i; j < k - i; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[k - j][i];
                mat[k - j][i] = mat[k - i][k - j];
                mat[k - i][k - j] = mat[j][k - i];
                mat[j][k - i] = t;
            }
    }
}