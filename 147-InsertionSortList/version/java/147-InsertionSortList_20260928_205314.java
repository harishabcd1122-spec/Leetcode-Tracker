// Last updated: 9/28/2026, 8:53:14 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode insertionSortList(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        ListNode prev = dummy;
15
16        while(head != null){
17            ListNode temp = head.next;
18            if(prev.val >= head.val) prev = dummy;
19
20            while(prev.next != null && prev.next.val < head.val) prev = prev.next;
21
22            head.next = prev.next;
23            prev.next = head;
24            head = temp;
25        }
26        return dummy.next;
27    }
28}