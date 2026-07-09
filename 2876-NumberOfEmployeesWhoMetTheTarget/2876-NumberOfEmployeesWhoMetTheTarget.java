// Last updated: 7/9/2026, 3:05:28 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                c++;
            }
        }
        return c;
    }
}