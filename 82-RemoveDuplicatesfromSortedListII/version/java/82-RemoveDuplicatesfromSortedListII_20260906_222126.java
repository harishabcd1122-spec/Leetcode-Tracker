// Last updated: 9/6/2026, 10:21:26 PM
1class Solution {
2    public Node connect(Node root) {
3        Queue<Node> q = new LinkedList<>();
4        if(root == null){
5            return root ;
6        }
7
8        q.offer(root);
9
10        while(!q.isEmpty()){
11            int n = q.size();
12            for(int i = 0 ; i < n ; i++){
13                Node curr = q.poll();
14                if(i == n - 1){
15                    curr.next = null ;
16                }else{
17                    curr.next = q.peek();
18                }
19
20                if(curr.left != null){
21                    q.offer(curr.left);
22                }
23
24                if(curr.right != null){
25                    q.offer(curr.right);
26                }
27            }
28        }
29
30        return root ;
31    }
32}