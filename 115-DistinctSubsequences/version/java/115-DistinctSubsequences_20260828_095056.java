// Last updated: 8/28/2026, 9:50:56 AM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int n = prices.length;
4
5        int[][][] dp = new int[n][2][k+1];
6
7        for(int i=0;i<n;i++){
8            for(int j=0;j<2;j++){
9                Arrays.fill(dp[i][j], -1);
10            }
11        }
12
13        return helper(0, 1, k, prices, dp);
14    }
15
16    private int helper(int idx, int canBuy, int k, int[] prices, int[][][] dp){
17        if(idx == prices.length) return 0;
18        if(k == 0) return 0;
19
20        if(dp[idx][canBuy][k] != -1) return dp[idx][canBuy][k];
21
22        int profit = 0;
23
24        if(canBuy == 1){
25            profit = Math.max(-prices[idx] + helper(idx+1, 0, k, prices, dp), 0 + helper(idx+1, 1, k, prices, dp));
26        }
27        else{
28            profit = Math.max(prices[idx] + helper(idx+1, 1, k-1, prices, dp), 0 + helper(idx+1, 0, k, prices, dp));
29        }
30
31        return dp[idx][canBuy][k] = profit;
32    }
33}