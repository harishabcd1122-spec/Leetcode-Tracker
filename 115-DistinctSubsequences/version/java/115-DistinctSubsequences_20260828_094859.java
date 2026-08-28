// Last updated: 8/28/2026, 9:48:59 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int lo = 0, hi = nums.length - 1;
4        
5        if (nums[lo] < nums[hi]) return nums[lo];
6        
7        while (lo < hi) {
8            int mid = lo + (hi - lo) / 2;
9            
10            if (nums[mid] > nums[hi]) {
11                lo = mid + 1;
12            } else if (nums[mid] < nums[hi]) {
13                hi = mid;
14            } else {
15                hi--;
16            }
17        }
18        
19        return nums[hi];
20    }
21}