// Last updated: 9/28/2026, 8:32:51 PM
1class Solution {
2
3    static int duplicateNum(int nums[])
4    {
5         HashSet<Integer> set = new HashSet<>();
6        for(int num : nums){
7            if(set.contains(num))
8            {
9                return num;
10            }
11            set.add(num);
12        }
13        return -1;
14    }
15
16    static int missingNum(int nums[])
17    {
18         HashSet<Integer> set = new HashSet<>();
19        for(int num : nums)
20        {
21            set.add(num);
22        }
23
24        for(int i = 1; i <= nums.length; i++)
25        {
26            if(!set.contains(i))
27            {
28                return i;
29            }
30        }
31        return -1;
32    }
33
34    public int[] findErrorNums(int[] nums) {
35        List<Integer> ans = new ArrayList<>();
36
37        int Duplicate = duplicateNum(nums);
38        int Missing = missingNum(nums);
39
40        ans.add(Duplicate);
41        ans.add(Missing);
42
43        return new int[] {ans.get(0), ans.get(1)};
44    }
45}