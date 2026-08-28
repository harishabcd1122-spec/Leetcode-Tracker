// Last updated: 8/28/2026, 10:21:27 AM
1class Solution {
2    public void placequeen(List<List<String>> ans,List<StringBuilder> tans,int n,boolean[] ld,boolean[] rd,boolean[] col,int i){
3        if(i==n){
4            List<String> temp=new ArrayList<>();
5            for(StringBuilder s:tans) temp.add(s.toString());
6            ans.add(temp);
7            return;
8        }
9        for(int j=0;j<n;j++){
10            if(col[j] || ld[n-1+i-j] || rd[i+j]) continue;
11            col[j]=true;
12            ld[n-1+i-j]=true;
13            rd[i+j]=true;
14            tans.get(i).setCharAt(j,'Q');
15            placequeen(ans,tans,n,ld,rd,col,i+1);
16            col[j]=false;
17            ld[n-1+i-j]=false;
18            rd[i+j]=false;
19            tans.get(i).setCharAt(j,'.');
20        }
21    }
22    public List<List<String>> solveNQueens(int n) {
23        List<List<String>> ans=new ArrayList<>();
24        List<StringBuilder> tans=new ArrayList<>();
25        for(int i=0;i<n;i++){
26            StringBuilder s=new StringBuilder();
27            for(int j=0;j<n;j++) s.append('.');
28            tans.add(s);
29        }
30        boolean[] ld=new boolean[2*n-1],rd=new boolean[2*n-1],col=new boolean[n];
31        placequeen(ans,tans,n,ld,rd,col,0);
32        return ans;
33    }
34}