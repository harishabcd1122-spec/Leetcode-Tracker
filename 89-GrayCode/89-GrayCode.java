// Last updated: 9/25/2026, 12:58:14 PM
class Solution {
    private boolean fun(List<Integer> curr, int n, boolean[] isUsed, List<Integer> res) {
        // Base case: All 2^n sequence slots filled successfully
        if(curr.size() == 1 << n) {
            int last = curr.get(curr.size() - 1);
            // Cycle Verification: First element (0) and last must differ by exactly 1 bit
            if((last & (last - 1)) != 0) return false; 
            res.addAll(curr); // Persist valid array elements to output reference
            return true;
        }
        
        int last = curr.get(curr.size() - 1);
        
        // Every unique value contains exactly 'n' possible bit-flip pathways
        for(int i = 0; i < n; i++){
            int next = last ^ (1 << i); // Toggles the i-th bit cleanly using XOR
            
            if(next >= (1 << n)) continue;
            if(isUsed[next]) continue;
            
            // Step forward: Register tracking states
            isUsed[next] = true;
            curr.add(next);
            
            if(fun(curr, n, isUsed, res)) return true; // Recurse
            
            // Backtrack: Restore state variables horizontally
            curr.remove(curr.size() - 1);
            isUsed[next] = false;
        }
        return false;
    }

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] isUsed = new boolean[1 << n];
        
        curr.add(0);
        isUsed[0] = true;
        
        fun(curr, n, isUsed, res);
        return res;
    }
}