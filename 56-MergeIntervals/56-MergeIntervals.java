// Last updated: 7/9/2026, 3:09:40 PM
class Solution {
    public int[][] merge(int[][] it) {
        Arrays.sort(it,(a,b)->Integer.compare(a[0],b[0]));
        int k=0;
        for(int i=1;i<it.length;i++){
            if(it[k][1]>=it[i][0]){
                it[k][1]=Math.max(it[i][1],it[k][1]);
            }
            else{
                k++;
                it[k]=it[i];
            }
        }
        return Arrays.copyOfRange(it,0,k+1);
    }
}