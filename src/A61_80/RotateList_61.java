package A61_80;

import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class RotateList_61 {
    /*
Given the head of a linked list, rotate the list to the right by k places.



Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]


     */

    public static void main(String[] args) {
        ListNode head = new ListNode(10) {
        };
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        head = rotateRight(head, 6);
        printList(head);


    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }


    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int length = 1;
        ListNode tail = head;
        for (; tail.next != null; tail = tail.next)
            ++length;
        tail.next = head; // Circle the list.

        final int t = length - k % length;
        for (int i = 0; i < t; ++i)
            tail = tail.next;
        ListNode newHead = tail.next;
        tail.next = null;

        return newHead;
    }





}
