// Last updated: 9/25/2026, 12:56:34 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int n : numSet) {
            if (!numSet.contains(n - 1)) {
                int length = 1;

                while (numSet.contains(n + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}