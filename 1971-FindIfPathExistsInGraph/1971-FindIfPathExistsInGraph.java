// Last updated: 9/25/2026, 12:49:11 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        
        }
        int m=edges.length;
        for(int i=0;i<m;i++){
            int sv=edges[i][0];
            int ev=edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        boolean x=bfs(n, adj,source,  destination);
        return x;
        
    }
    boolean bfs(int  n,List<List<Integer>> adj,int source, int destination)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean[] arr=new boolean[n];
        q.add(source);
        arr[source]=true;
        while(q.size()>0){
            int curr=q.poll();
            System.out.println(curr+ " ");
            
            int m=adj.get(curr).size();
            for(int i=0;i<m;i++){
                int x=adj.get(curr).get(i);
                if(arr[x]==false){
                    q.add(x);
                }
                arr[x]=true;
            }

        }
        if(arr[source]==arr[destination]){
            return true;
        }
        return false;
        
    }  
}
    
