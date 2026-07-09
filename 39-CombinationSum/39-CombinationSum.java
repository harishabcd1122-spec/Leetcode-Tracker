// Last updated: 7/9/2026, 3:10:01 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        method(ans,new ArrayList<>(),nums,target,0);
        return ans;
    }
    void method(List<List<Integer>>ans,List<Integer>temp,int[]nums,int r,int start){
        if(r<0) return;
        else if(r==0) ans.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<nums.length;i++){
                temp.add(nums[i]);
                method(ans,temp,nums,r-nums[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }
}