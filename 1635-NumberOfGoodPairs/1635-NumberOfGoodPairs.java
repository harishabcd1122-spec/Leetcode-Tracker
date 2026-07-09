// Last updated: 7/9/2026, 3:06:05 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
         Map<Integer,Integer>freq = new HashMap();
        int pairs=0;
        for(int x:nums){
            pairs+=freq.getOrDefault(x,0);
            freq.put(x,freq.getOrDefault(x,0)+1);
        }    
        return pairs;
        
    }
}