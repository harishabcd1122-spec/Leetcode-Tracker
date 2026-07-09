// Last updated: 7/9/2026, 3:06:54 PM
class Solution {
    public int recursion(String s,int left,int right,HashMap<String,Integer> map){

        if(left>right) return 0;
        if(left==right) return 1;
        String t=left+","+right;
        if(map.containsKey(t)) return map.get(t); 
        int ans;
        if(s.charAt(left)==s.charAt(right)) ans=2+recursion(s,left+1,right-1,map);
        else{
            ans=Math.max (recursion(s,left+1,right,map),recursion(s,left,right-1,map));
        }
            map.put(t,ans);
            return ans;
        
    }
    public int longestPalindromeSubseq(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        return recursion (s,0,s.length()-1,map);
    }
}