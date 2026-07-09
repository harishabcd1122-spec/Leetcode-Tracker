// Last updated: 7/9/2026, 3:06:12 PM
class Solution {
    public int jobScheduling(int[] st, int[] en, int[] pr) {
        int [][] arr=new int[st.length][3];
        for(int i=0;i<st.length;i++){
            arr[i][0]=st[i];
            arr[i][1]=en[i];
            arr[i][2]=pr[i];
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        int n=st.length;

        int[] dp=new int[n+1];
        dp[n]=0;
        Arrays.sort(st);
        for(int i=n-1;i>=0;i--){
            int after=0;
            int current=arr[i][2];
            int end=arr[i][1];
            int ind=-1;
            for(int k=i+1;k<n;k++){
                if(end <= st[k]){
                ind=k;
                break;
            } 
        }
        if(ind!=-1) after =dp[ind];
        int tot=current+after;
        dp[i]=Math.max(tot,dp[i+1]);
        }
        return dp[0];
    }
}