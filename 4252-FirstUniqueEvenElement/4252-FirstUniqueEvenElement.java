// Last updated: 7/9/2026, 3:05:14 PM
class Solution {
    public int firstUniqueEven(int[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            
            // check if number is even
            if (nums[i] % 2 == 0) {
                
                int count = 0;
                
                // count how many times it appears
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                
                // if it appears exactly once
                if (count == 1) {
                    return nums[i];
                }
            }
        }
        
        return -1;
    }
}
        
    