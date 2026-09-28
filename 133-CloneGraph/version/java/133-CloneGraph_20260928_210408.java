// Last updated: 9/28/2026, 9:04:08 PM
1class Solution {
2    Map<Node, Node> mp = new HashMap<>();
3    public Node cloneGraph(Node node) {
4
5        if(node == null) {
6            return null;
7        }
8        
9        if(mp.containsKey(node)) {
10            return mp.get(node);
11        }
12
13        Node clone = new Node(node.val);
14        mp.put(node, clone);
15
16        for(Node neighbor : node.neighbors) {
17            clone.neighbors.add(cloneGraph(neighbor));
18        }
19
20        return clone;
21    }
22}