// Last updated: 7/9/2026, 3:09:56 PM
class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int larr[]= new int[n];
        int rarr[]= new int[n];
        int max=h[0];
        for(int i=0;i<n;i++){
            if(max < h[i]){
                max=h[i];
               
            }
             larr[i]= max;
        }
            int ans=0;
            max=h[n-1];
            for(int i=n-1;i>=0;i--){
                if (max < h[i]) max=h[i];  
                    rarr[i]=Math.min(max,larr[i]);
                    ans += Math.abs(rarr[i]-h[i]);
                
            }
            return ans;

        
    }
}