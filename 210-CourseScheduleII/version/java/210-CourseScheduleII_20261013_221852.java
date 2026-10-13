// Last updated: 10/13/2026, 10:18:52 PM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adjacencyList = new ArrayList<>(numCourses);
4        int[] courseOrder = new int[numCourses];
5        int[] inDegree = new int[numCourses];
6        int coursesCompleted = 0;
7        int idx = 0;
8
9
10        for (int i = 0; i < numCourses; i++)
11            adjacencyList.add(new ArrayList<>());
12
13
14        for (int[] arr : prerequisites) {
15            adjacencyList.get(arr[1]).add(arr[0]);
16            inDegree[arr[0]]++;
17        }
18
19
20        Deque<Integer> q = new ArrayDeque<>();
21
22
23        for (int i = 0; i < numCourses; i++)
24            if (inDegree[i] == 0)
25                q.addLast(i);
26
27
28        while (!q.isEmpty()) {
29            int course = q.removeFirst();
30            courseOrder[idx] = course;
31            coursesCompleted++;
32            idx++;
33
34
35            for (int neighbour : adjacencyList.get(course)) {
36                inDegree[neighbour]--;
37
38
39                if (inDegree[neighbour] == 0)
40                    q.addLast(neighbour);
41            }
42        }
43
44
45        return coursesCompleted == numCourses ? courseOrder : new int[0];
46    }
47}