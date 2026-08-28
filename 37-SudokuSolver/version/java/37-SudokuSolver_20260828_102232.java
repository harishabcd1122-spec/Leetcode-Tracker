// Last updated: 8/28/2026, 10:22:32 AM
1class Solution {
2    private int ans = 0;
3
4    private void placeQueen(
5        int n,
6        boolean[] ld,
7        boolean[] rd,
8        boolean[] col,
9        int row
10    ) {
11        if (row == n) {
12            ans++;
13            return;
14        }
15
16        for (int j = 0; j < n; j++) {
17            int leftDiagonal = n - 1 + row - j;
18            int rightDiagonal = row + j;
19
20            if (col[j] || ld[leftDiagonal] || rd[rightDiagonal])
21                continue;
22
23            col[j] = true;
24            ld[leftDiagonal] = true;
25            rd[rightDiagonal] = true;
26
27            placeQueen(n, ld, rd, col, row + 1);
28
29            col[j] = false;
30            ld[leftDiagonal] = false;
31            rd[rightDiagonal] = false;
32        }
33    }
34
35    public int totalNQueens(int n) {
36        boolean[] ld = new boolean[2 * n - 1];
37        boolean[] rd = new boolean[2 * n - 1];
38        boolean[] col = new boolean[n];
39
40        placeQueen(n, ld, rd, col, 0);
41
42        return ans;
43    }
44}