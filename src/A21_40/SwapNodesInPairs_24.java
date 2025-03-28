package A21_40;

public class SwapNodesInPairs_24 {
    /*
    Given a linked list, swap every two adjacent nodes and return its head. You must solve
    the problem without modifying the values in the list's nodes (i.e., only nodes
     themselves may be changed.)
Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]


     */
    public static void main(String[] args) {



    }
    public static ListNode swapPairs(ListNode head) {
        final int length = getLength(head);
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        for (int i = 0; i < length / 2; ++i) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = curr;
            prev.next = next;
            prev = curr;
            curr = curr.next;
        }

        return dummy.next;
    }

    private  static int getLength(ListNode head) {
        int length = 0;
        for (ListNode curr = head; curr != null; curr = curr.next)
            ++length;
        return length;
    }




}
