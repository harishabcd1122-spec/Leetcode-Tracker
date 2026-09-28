// Last updated: 9/28/2026, 8:51:50 PM
1class Node {
2    int key;
3    int val;
4    Node prev;
5    Node next;
6
7    public Node(int key, int val) {
8        this.key = key;
9        this.val = val;
10        this.prev = null;
11        this.next = null;
12    }
13}
14
15
16class LRUCache {
17
18    private int cap;
19    private Map<Integer, Node> cache;
20    private Node oldest;
21    private Node latest;
22
23    public LRUCache(int capacity) {
24        this.cap = capacity;
25        this.cache = new HashMap<>();
26        this.oldest = new Node(0, 0);
27        this.latest = new Node(0, 0);
28        this.oldest.next = this.latest;
29        this.latest.prev = this.oldest;
30    }
31
32    public int get(int key) {
33        if (cache.containsKey(key)) {
34            Node node = cache.get(key);
35            remove(node);
36            insert(node);
37            return node.val;
38        }
39        return -1;
40    }
41
42    private void remove(Node node) {
43        Node prev = node.prev;
44        Node next = node.next;
45        prev.next = next;
46        next.prev = prev;
47    }
48
49    private void insert(Node node) {
50        Node prev = latest.prev;
51        Node next = latest;
52        prev.next = next.prev = node;
53        node.next = next;
54        node.prev = prev;
55    }
56
57    public void put(int key, int value) {
58        if (cache.containsKey(key)) {
59            remove(cache.get(key));
60        }
61        Node newNode = new Node(key, value);
62        cache.put(key, newNode);
63        insert(newNode);
64
65        if (cache.size() > cap) {
66            Node lru = oldest.next;
67            remove(lru);
68            cache.remove(lru.key);
69        }
70    }
71}