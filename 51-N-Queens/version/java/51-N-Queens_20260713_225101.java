// Last updated: 7/13/2026, 10:51:01 PM
1import java.util.Stack;
2
3class Solution {
4    public int largestRectangleArea(int[] heights) {
5        Stack<Integer> stack = new Stack<>();
6        stack.push(-1);
7        int maxArea = 0;
8
9        for (int i = 0; i < heights.length; i++) {
10            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()]) {
11                int height = heights[stack.pop()];
12                int width = i - stack.peek() - 1;
13                maxArea = Math.max(maxArea, height * width);
14            }
15            stack.push(i);
16        }
17
18        while (stack.peek() != -1) {
19            int height = heights[stack.pop()];
20            int width = heights.length - stack.peek() - 1;
21            maxArea = Math.max(maxArea, height * width);
22        }
23
24        return maxArea;
25    }
26}