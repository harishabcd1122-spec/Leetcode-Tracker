// Last updated: 7/9/2026, 3:09:59 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        method(ans,candidates,target,temp,0);
        return ans;
    }
    void method(List<List<Integer>> ans,int []arr,int required,List<Integer> temp,int start){
        if(required==0){
            if(!ans.contains(temp))
            ans.add(new ArrayList<>(temp)); 
            return;
        }
        if(required<0) return;
        for(int i=start;i<arr.length;i++){
            if(i>start &&arr[i]==arr[i-1]) continue;
            temp.add(arr[i]);
            method(ans,arr,required-arr[i],temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}