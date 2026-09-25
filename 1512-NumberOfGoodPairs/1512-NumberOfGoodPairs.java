// Last updated: 9/25/2026, 12:49:38 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
         for(int i=0;i<nums.length;i++){
          freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);}
          for(int n:freq.values()){
            pairs=pairs+(n*(n-1))/2;}
        return pairs;

    }
}