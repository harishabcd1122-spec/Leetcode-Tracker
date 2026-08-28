// Last updated: 8/28/2026, 9:13:05 AM
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        int left = 1;
4        int right = n;
5
6        while (left <= right) {
7            int middle = left + (right - left) / 2;
8            int rez = guess(middle);
9
10            if (rez == 0) {
11                return middle;
12            } else if (rez == -1) {
13                right = middle - 1;
14            } else {
15                left = middle + 1;
16            }
17        }
18
19        return -1;
20    }
21}