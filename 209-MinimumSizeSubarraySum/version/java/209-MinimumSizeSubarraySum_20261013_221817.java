// Last updated: 10/13/2026, 10:18:17 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] arr) {
3        // Sliding Windows
4        int n = arr.length , minLen = Integer.MAX_VALUE;
5        int i = 0 , j = 0 , sum = 0;
6
7        while(j < n && sum < target){
8            sum += arr[j];
9            j++;
10        }
11        j--;
12        // Sliding window
13        while(i < n && j < n){
14            int len = j-i+1;
15            if(sum >= target) minLen = Math.min(minLen,len);
16            sum -= arr[i];
17            i++;
18            j++;
19
20            while(j < n && sum < target){
21                sum += arr[j];
22                j++;
23            }
24            j--;
25        }
26        if(minLen == Integer.MAX_VALUE) return 0;
27        return minLen;
28        
29    }
30}