// Last updated: 9/28/2026, 9:01:46 PM
1public class Solution {
2    public int[][] generateMatrix(int n) {
3        // Declaration
4        int[][] matrix = new int[n][n];
5        
6        // Edge Case
7        if (n == 0) {
8            return matrix;
9        }
10        
11        // Normal Case
12        int rowStart = 0;
13        int rowEnd = n-1;
14        int colStart = 0;
15        int colEnd = n-1;
16        int num = 1; //change
17        
18        while (rowStart <= rowEnd && colStart <= colEnd) {
19            for (int i = colStart; i <= colEnd; i ++) {
20                matrix[rowStart][i] = num ++; //change
21            }
22            rowStart ++;
23            
24            for (int i = rowStart; i <= rowEnd; i ++) {
25                matrix[i][colEnd] = num ++; //change
26            }
27            colEnd --;
28            
29            for (int i = colEnd; i >= colStart; i --) {
30                if (rowStart <= rowEnd)
31                    matrix[rowEnd][i] = num ++; //change
32            }
33            rowEnd --;
34            
35            for (int i = rowEnd; i >= rowStart; i --) {
36                if (colStart <= colEnd)
37                    matrix[i][colStart] = num ++; //change
38            }
39            colStart ++;
40        }
41        
42        return matrix;
43    }
44}