// Last updated: 9/25/2026, 12:51:49 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int l=isConnected.length;
        boolean[] visited=new boolean[l];
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(visited[i]==false)
            {
             c++;
             bfs(i,isConnected,l,visited);
            }
        }
        return c;
    }
    void bfs(int sv,int [][] isConnected,int l,boolean [] visited)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(sv);
        visited[sv]=true;
        while(q.size()>0){
            int curr=q.poll();
            for(int i=0;i<l;i++){
                if(isConnected[curr][i]==1 && visited[i]==false)
                {
                    q.add(i);
                    visited[i]=true
;                }
            }
        }
    }
}