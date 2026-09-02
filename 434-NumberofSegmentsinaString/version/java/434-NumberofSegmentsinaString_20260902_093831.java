// Last updated: 9/2/2026, 9:38:31 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        // Step 1: **Transpose** the matrix
6        // Swap elements across the main diagonal
7        for (int i = 0; i < n; i++) {
8            for (int j = i + 1; j < n; j++) {
9                int temp = matrix[i][j];
10                matrix[i][j] = matrix[j][i];
11                matrix[j][i] = temp;
12            }
13        }
14
15        // Step 2: **Reverse** each row
16        // Swap elements from left to right for each row
17        for (int i = 0; i < n; i++) {
18            int left = 0;
19            int right = n - 1;
20            while (left < right) {
21                int temp = matrix[i][left];
22                matrix[i][left] = matrix[i][right];
23                matrix[i][right] = temp;
24                left++;
25                right--;
26            }
27        }
28    }
29}