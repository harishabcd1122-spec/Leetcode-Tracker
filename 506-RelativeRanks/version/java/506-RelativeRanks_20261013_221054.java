// Last updated: 10/13/2026, 10:10:54 PM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3
4         int n = score.length;
5        String[] res = new String[n];
6        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)-> Integer.compare(b[0],a[0]));
7        
8
9        for(int i = 0 ; i<n ; i++){
10            maxHeap.add(new int[]{score[i],i});
11        }
12
13        int cnt = 0; 
14        while(!maxHeap.isEmpty()){
15            int[] keyValue = maxHeap.poll();
16            cnt++;
17            int key = keyValue[0];
18            int idx = keyValue[1];
19            if(cnt <= 3){
20                switch(cnt){
21                    case 1: 
22                    res[idx] = "Gold Medal";
23                    break;
24
25                    case 2:
26                    res[idx] = "Silver Medal";
27                    break;
28
29                    case 3:
30                    res[idx] = "Bronze Medal";
31                    break;
32
33                    default:
34                    break;
35                }
36            }
37            else{ res[idx] = Integer.toString(cnt); }
38        }
39        return res;
40
41    }
42}