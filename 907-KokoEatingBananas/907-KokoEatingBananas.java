// Last updated: 7/9/2026, 3:06:35 PM
class Solution {
    public int maxi(int[] piles){
        int m=0;
        for(int i:piles){
            m=Math.max(m,i);
        }
        return m;
    }
    public int calculate(int[] piles,int mid){
        int c=0;
        for(int i:piles){
            c+=(i/mid);
            if(i%mid != 0) c++;
        }
        return c;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1,e=maxi(piles);
        while(s<e){
            int mid=(s+e)/2;
            int cal_hours=calculate(piles,mid);
            if(cal_hours >h) s=mid+1;
            else e=mid;
        }
        return s;
    }
}