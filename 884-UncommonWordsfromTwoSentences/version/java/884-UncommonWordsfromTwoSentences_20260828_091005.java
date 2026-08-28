// Last updated: 8/28/2026, 9:10:05 AM
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        String[] arr1 = s1.split(" ");
4        String[] arr2 = s2.split(" ");
5        String[] arr = new String[arr1.length + arr2.length];
6        for(int i=0;i<arr1.length;i++){
7            arr[i] = arr1[i];
8        }
9        for(int i=0,j=arr1.length;i<arr2.length;i++,j++){
10            arr[j] = arr2[i];
11        }
12        HashSet<String> set = new HashSet<>();
13        HashSet<String> s = new HashSet<>();
14        for(int i=0;i<arr.length;i++){
15            if(!s.isEmpty() && s.contains(arr[i])){
16                continue;
17            }
18            if(!set.isEmpty() && set.contains(arr[i])){
19                set.remove(arr[i]);
20                s.add(arr[i]);
21            }
22            else{
23                set.add(arr[i]);
24            }
25        }
26        String[] res = new String[set.size()];
27        int j=0;
28        for (String i : set) {
29            res[j] = i;
30            j++;
31        }
32        return res;
33    }
34}