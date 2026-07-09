// Last updated: 7/9/2026, 3:09:51 PM
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int end = 0;
        int farthest = 0;

        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            farthest = Math.max(farthest, i + nums[i]);

            if(i == end){
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }
}