// Last updated: 9/28/2026, 9:05:24 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int maxProduct = nums[0];
4        int minProduct = nums[0];
5        int res = nums[0];
6        for(int i = 1; i < nums.length; i ++)
7        {
8            int num = nums[i];
9            if(num < 0)
10            {
11                int temp = maxProduct;
12                maxProduct = minProduct;
13                minProduct = temp;
14            }
15            maxProduct = Math.max(num, num * maxProduct);
16            minProduct = Math.min(num, num * minProduct);
17            res = Math.max(res, maxProduct);
18        }
19        return res;
20    }
21}