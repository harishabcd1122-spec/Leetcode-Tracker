// Last updated: 7/9/2026, 3:11:01 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> Map=new HashMap<>();
        int i=0,j=0,count=0;
        for(j=0;j<s.length();j++){
            while( Map.containsKey(s.charAt(j)) && Map.get(s.charAt(j))>=i){
                
                i++;
            }
        Map.put(s.charAt(j),j);
        count=Math.max(count,j-i+1);
        }   
        return count;    
    }
}