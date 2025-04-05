package A81_100;

import A0_20.ListNode;

public class RemoveDuplicatesFromSortedListII_82 {
    /*
    Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.



Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]


Constraints:

The number of nodes in the list is in the range [0, 300].
     */

    public static void main(String[] args) {


    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (head != null) {
            while (head.next != null && head.val == head.next.val)
                head = head.next;
            if (prev.next == head)
                prev = prev.next;
            else
                prev.next = head.next;
            head = head.next;
        }

        return dummy.next;
    }



}
