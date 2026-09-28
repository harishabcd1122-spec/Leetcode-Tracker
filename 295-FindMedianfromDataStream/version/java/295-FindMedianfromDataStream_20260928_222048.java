// Last updated: 9/28/2026, 10:20:48 PM
1class MedianFinder {
2        /*
3        #########################################################################
4        #                                                                       #
5        #  =============================================                        #
6        #                  SIDDARDHA CHILUVERU                                  #
7        #  =============================================                        #
8        #                                                                       #
9        #  Author      : Siddardha Chiluveru                                    #
10        #  Description : Solution / Code / Project                              #
11        #  Date        : 2026-23-08                                             #
12        #                                                                       #
13        #########################################################################
14        */
15    PriorityQueue<Integer> min;
16    PriorityQueue<Integer> max;
17    public MedianFinder() {
18        min = new PriorityQueue<>();
19        max = new PriorityQueue<>(Collections.reverseOrder());
20    }
21    
22    public void addNum(int num) {
23        if (max.isEmpty() || max.peek() >= num)
24            max.offer(num);
25        else
26            min.offer(num);
27        
28        if (min.size() > max.size())
29            max.offer(min.poll());
30        else if (max.size() > min.size() + 1)
31            min.offer(max.poll());
32    }
33    
34    public double findMedian() {
35        if (max.size() > min.size())
36            return max.peek();
37        return (max.peek() + min.peek()) / 2.0;
38    }
39}
40