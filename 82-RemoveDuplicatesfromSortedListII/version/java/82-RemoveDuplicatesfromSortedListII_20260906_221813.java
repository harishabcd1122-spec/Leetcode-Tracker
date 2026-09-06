// Last updated: 9/6/2026, 10:18:13 PM
1class Solution {
2    public TreeNode sortedListToBST(ListNode head) {
3        if(head == null) return null;
4        if(head.next == null) return new TreeNode(head.val);
5        ListNode middle = getMiddle(head);
6        TreeNode root = new TreeNode(middle.val);
7        root.right = sortedListToBST(middle.next);
8        middle.next =null;
9        root.left = sortedListToBST(head);
10        return root;
11    }
12    
13    public ListNode getMiddle(ListNode head){
14        //if(head == null || head.next==null) return null;
15        ListNode fast = head;
16        ListNode slow = head;
17        ListNode prev = null;
18        while(fast!=null && fast.next!=null){
19            fast = fast.next.next;
20            prev = slow;
21            slow = slow.next;
22            
23        }
24        if(prev!=null)prev.next =null;
25        return slow;
26    }
27}