// Last updated: 7/9/2026, 3:06:59 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer>hm =new HashMap();
        Stack<Integer>s =new Stack();
        int[] res=new int[nums1.length];
        Arrays.fill(res, -1);
        for(int x :nums2){
            while(s.empty() == false && x>s.peek()){
                hm.put(s.peek(), x);
                s.pop();
            }
            s.push(x);
        }
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                res[i] =hm . get(nums1[i]);
            }
    }
    return res;
    }
}