package A81_100;

import A0_20.ListNode;

public class RemoveDuplicatesFromSortedList_83 {
    /*
Given the head of a sorted linked list, delete all duplicates such
that each element appears only once. Return the linked list sorted as well.
Example 1:
Input: head = [1,1,2]
Output: [1,2]
     */

    public static void main(String[] args) {


    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val)
                curr.next = curr.next.next;
            curr = curr.next;
        }

        return head;
    }




}
