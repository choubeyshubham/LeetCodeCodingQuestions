package A21_40;

public class ReverseNodesInKGroup_25 {
    /*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.


     */

    public static void main(String[] args) {



    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode tail = head;

        for (int i = 0; i < k; ++i) {
            // There are less than k nodes in the list, do nothing.
            if (tail == null)
                return head;
            tail = tail.next;
        }

        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    // Reverses [head, tail).
    private static ListNode reverse(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }




}
