// Last updated: 7/9/2026, 3:10:45 PM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            int val=map.get(s.charAt(i));
            int next=((i+1)<s.length())?map.get(s.charAt(i+1)):0;
            if(val<next){
                ans-=val;
            }
            else{
                ans+=val;
            }

        }
        return ans ;
    }
}