// Last updated: 7/9/2026, 3:05:17 PM
class Solution {
    public int countCommas(long n) {
        long commas = 0;

        if (n >= 1000) {
            commas += (Math.min(n, 999999) - 999) * 1;
        }

        if (n >= 1000000) {
            commas += (Math.min(n, 999999999) - 999999) * 2;
        }

        if (n >= 1000000000) {
            commas += (n - 999999999) * 3;
        }

        return (int) commas;
    }
}