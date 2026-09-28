// Last updated: 9/28/2026, 9:03:19 PM
1import java.util.*;
2
3class Solution {
4
5    public void solve(char[][] board) {
6        int m = board.length;
7        int n = board[0].length;
8
9        // Process first and last rows
10        for (int j = 0; j < n; j++) {
11            bfs(board, 0, j);
12            bfs(board, m - 1, j);
13        }
14
15        // Process first and last columns
16        for (int i = 0; i < m; i++) {
17            bfs(board, i, 0);
18            bfs(board, i, n - 1);
19        }
20
21        // Capture surrounded regions
22        for (int i = 0; i < m; i++) {
23            for (int j = 0; j < n; j++) {
24
25                if (board[i][j] == 'O') {
26                    board[i][j] = 'X';
27                } else if (board[i][j] == '#') {
28                    board[i][j] = 'O';
29                }
30            }
31        }
32    }
33
34    private void bfs(char[][] board, int row, int col) {
35        if (board[row][col] != 'O') {
36            return;
37        }
38
39        int m = board.length;
40        int n = board[0].length;
41
42        Queue<int[]> queue = new LinkedList<>();
43        queue.offer(new int[]{row, col});
44
45        // Mark as safe
46        board[row][col] = '#';
47
48        int[][] directions = {
49            {-1, 0},
50            {1, 0},
51            {0, -1},
52            {0, 1}
53        };
54
55        while (!queue.isEmpty()) {
56            int[] current = queue.poll();
57
58            int r = current[0];
59            int c = current[1];
60
61            for (int[] dir : directions) {
62                int nr = r + dir[0];
63                int nc = c + dir[1];
64
65                if (nr >= 0 && nr < m &&
66                    nc >= 0 && nc < n &&
67                    board[nr][nc] == 'O') {
68
69                    board[nr][nc] = '#';
70                    queue.offer(new int[]{nr, nc});
71                }
72            }
73        }
74    }
75}