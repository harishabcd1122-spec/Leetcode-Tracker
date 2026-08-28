// Last updated: 8/28/2026, 9:04:44 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3
4        ArrayList<Integer> l1 = new ArrayList<>();
5        HashSet<Integer> s1 = new HashSet<>();
6
7        for (int no : nums1) {
8            s1.add(no);
9        }
10
11        for (int no : nums2) {
12            if (s1.contains(no)) {
13                s1.remove(no);
14                l1.add(no);
15            }
16        }
17
18        int[] arr = new int[l1.size()];
19        int i = 0;
20
21        for (int num : l1) {
22            arr[i++] = num;
23        }
24
25        return arr;
26    }
27}