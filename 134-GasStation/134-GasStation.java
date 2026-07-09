// Last updated: 7/9/2026, 3:08:41 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tc=0;
        int rg=0;
        int ans=0;
        for(int i=0;i<gas.length;i++){
            tc+=gas[i] - cost[i];
            rg+=gas[i] - cost[i];
            if(rg<0){
                rg=0;
                ans=i+1;
            }
        }
        return tc>=0? ans:-1;
    }
}