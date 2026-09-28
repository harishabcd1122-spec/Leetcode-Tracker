// Last updated: 9/28/2026, 10:25:28 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> countSmaller(int[] nums) {
5        int total = nums.length;
6        int[] answer = new int[total];
7
8        int lowest = nums[0];
9        int highest = nums[0];
10        for (int val : nums) {
11            if (val < lowest) lowest = val;
12            if (val > highest) highest = val;
13        }
14        int shift = 1 - lowest;
15        int limit = highest - lowest + 2;
16        int[] bit = new int[limit];
17
18        for (int pos = total - 1; pos >= 0; pos--) {
19            int key = nums[pos] + shift;
20            int running = 0;
21            for (int idx = key - 1; idx > 0; idx -= idx & -idx) {
22                running += bit[idx];
23            }
24            answer[pos] = running;
25            for (int idx = key; idx < limit; idx += idx & -idx) {
26                bit[idx]++;
27            }
28        }
29
30        return new AbstractList<Integer>() {
31            @Override
32            public Integer get(int at) {
33                return answer[at];
34            }
35
36            @Override
37            public int size() {
38                return total;
39            }
40        };
41    }
42}