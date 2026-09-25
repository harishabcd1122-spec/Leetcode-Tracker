// Last updated: 9/25/2026, 12:52:54 PM
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> result=new ArrayList<>();
        for(int hh=0;hh<=11;hh++){
            for(int mm=0;mm<=59;mm++){
                if(Integer.bitCount(hh)+
                Integer.bitCount(mm)==turnedOn){
                    
                    result.add(hh + ":" + (mm < 10 ? "0" : "") + mm);
                }
            }
        }
        return result;

    }
}