// Last updated: 7/9/2026, 3:10:25 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        int count = 0;

        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        ListNode prev = null;
        curr = head;
        count = 0;

        while (count < k) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;
    }
}