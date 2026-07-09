// Last updated: 7/9/2026, 3:09:27 PM
class Solution {
    public int minDistance(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int [][] arr=new int[w1+1][w2+1];
        for(int i=0;i<w2+1;i++){
            arr[0][i]=i;
        }
        for(int j=0;j<w1+1;j++){
            arr[j][0]=j;
        }
        for(int i=1;i<w1+1;i++){
            for(int j=1;j<w2+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }
                else{
                    arr[i][j]=1+Math.min((Math.min(arr[i-1][j],arr[i][j-1])),arr[i-1][j-1]);
                }
            }
        }
        return arr[w1][w2];
    }
}