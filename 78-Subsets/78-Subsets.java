// Last updated: 7/9/2026, 3:09:19 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> tarr=new ArrayList<>();
        method(ans,tarr,nums,0);
        return ans;
    }
    void method(List<List<Integer>> ans,List<Integer> tarr,int[] nums,int idx){
        ans.add(new ArrayList(tarr));
        for(int i=idx;i<nums.length;i++){
            tarr.add(nums[i]);
            method(ans,tarr,nums,i+1);
            tarr.remove(tarr.size()-1);
        }
    }
}