// Last updated: 9/25/2026, 12:54:15 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int l=nums.length;
        List <Integer> ans=new ArrayList<>();
        HashMap <Integer,Integer> sh=new HashMap<>();
        for(int i=0;i<l;i++)
        {
            sh.put(nums[i],sh.getOrDefault(nums[i],0)+1);
        }
        int n=l/3;
        for(Map.Entry<Integer,Integer> en:sh.entrySet())
        {
            if(en.getValue()>n)
             ans.add(en.getKey()); 
        }
        return ans;

    }
}