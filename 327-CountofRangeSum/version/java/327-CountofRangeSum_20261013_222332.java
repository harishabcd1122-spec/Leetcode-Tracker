// Last updated: 10/13/2026, 10:23:32 PM
1// Solution for countRangeSum
2class Solution {
3    private int lower;
4    private int upper;
5    private int count = 0;
6    private long[] pfxSum;
7    
8    public int countRangeSum(int[] nums, int lower, int upper) {
9        int n = nums.length;
10        this.lower = lower;
11        this.upper = upper;
12        
13        this.pfxSum = new long[n+1];
14        for (int i = 0; i < n; i++) {
15            pfxSum[i+1] = pfxSum[i] + nums[i];
16        }
17        
18        mergeSort(0, n);
19        return count;
20    }
21	
22	private void mergeSort(int low, int high){
23		if (low >= high) return;
24		int mid = low + (high - low) / 2;
25		
26        mergeSort(low, mid); 
27		mergeSort(mid+1, high);
28        
29        int i = mid + 1, j = mid + 1;
30		for (int k = low; k <= mid; k++) {
31			while (i <= high && pfxSum[i] - pfxSum[k] < lower) i++;  
32			while (j <= high && pfxSum[j] - pfxSum[k] <= upper) j++;
33            
34			count += j - i;
35		}
36		
37		merge(low, mid, high);
38	}
39	
40	private void merge(int low, int mid, int high) {
41        long[] helper = new long[high - low + 1];
42        for (int i = low; i <= high; i++) {
43            helper[i - low] = pfxSum[i]; 
44        }
45        
46		int i = low, j = mid+1;
47        int idx = low;
48        
49        while (i <= mid && j <= high) {
50            if (helper[i - low] < helper[j - low]) {
51                pfxSum[idx++] = helper[i++ - low];
52            } else {
53                pfxSum[idx++] = helper[j++ - low];
54            }
55        }
56        
57        while (i <= mid) {
58            pfxSum[idx++] = helper[i++ - low];
59        }
60	}
61}