// Last updated: 7/9/2026, 3:08:22 PM
class Solution {
    public String convertToTitle(int s) {
        StringBuffer ans=new StringBuffer();
        while(s>0){
            s--;
            ans.append((char)  ((s%26)+'A'));
            s/=26;
        }
        return ans.reverse().toString();
        
        }
        
    
}