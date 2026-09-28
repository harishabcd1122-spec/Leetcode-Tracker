// Last updated: 9/28/2026, 8:54:10 PM
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
12    private ListNode findmid(ListNode head){
13        if(head == null || head.next == null){
14            return head;
15        }
16        ListNode slow = head;
17        ListNode fast = head.next;
18        while(fast!= null && fast.next != null){
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        return slow;
23
24    }
25
26    private ListNode merge(ListNode head1, ListNode head2){
27        ListNode mergeLL = new ListNode(-1);
28        ListNode temp = mergeLL;
29
30        while(head1 != null && head2 != null){
31            if(head1.val <= head2.val){
32                temp.next = head1;
33                head1 = head1.next;
34            }
35            else{
36                temp.next = head2;
37                head2 = head2.next;
38            }
39            temp = temp.next;
40         }
41
42         while(head1 != null){
43            temp.next = head1;
44            head1 = head1.next;
45            temp = temp.next;
46         }
47         while(head2 != null){
48            temp.next = head2;
49            head2 = head2.next;
50            temp = temp.next;
51         }
52    
53    return mergeLL.next;
54
55    }
56    public ListNode sortList(ListNode head) {
57        if(head == null || head.next == null){
58            return head;
59        }
60        ListNode mid = findmid(head);
61        ListNode righthead = mid.next;
62        mid.next = null;
63
64        ListNode left = sortList(head);
65        ListNode right = sortList(righthead);
66
67        return merge(left, right); 
68    }
69}