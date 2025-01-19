package A0_20;

public class RemoveNthNodeFromEndList_19 {
    /*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]


     */

    public static void main(String[] args) {



    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        while (n-- > 0)
            fast = fast.next;
        if (fast == null)
            return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }



}
