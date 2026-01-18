package A121_140;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer_138 {
    /*
A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.

For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
Your code will only be given the head of the original linked list.



Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]


Constraints:

0 <= n <= 1000
-104 <= Node.val <= 104
Node.random is null or is pointing to some node in the linked list.


     */
    private static Map<Node, Node> map = new HashMap<>();


    static void main() {
        int[][] arr={{7,-1},{13,0},{11,4},{10,2},{1,0}};



        /*
         Example:
         head = [[7,null],[13,0],[11,4],[10,2],[1,0]]

         Using -1 to represent null
        */

                Node n0 = new Node(7);
                Node n1 = new Node(13);
                Node n2 = new Node(11);
                Node n3 = new Node(10);
                Node n4 = new Node(1);

                // next pointers
                n0.next = n1;
                n1.next = n2;
                n2.next = n3;
                n3.next = n4;

                // random pointers
                n0.random = null;
                n1.random = n0;
                n2.random = n4;
                n3.random = n2;
                n4.random = n0;

                Node head = n0;

                // call static method
                Node copiedHead = copyRandomList(head);

                printList(copiedHead);


        }

    public static Node copyRandomList(Node head) {
        if (head == null)
            return null;
        if (map.containsKey(head))
            return map.get(head);

        Node newNode = new Node(head.val);
        map.put(head, newNode);
        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);
        return newNode;
    }


    public static void printList(Node head) {

        Map<Node, Integer> indexMap = new HashMap<>();
        Node curr = head;
        int index = 0;

        // Assign indices
        while (curr != null) {
            indexMap.put(curr, index++);
            curr = curr.next;
        }

        // Print [val, randomIndex]
        curr = head;
        System.out.print("[");
        while (curr != null) {
            Integer randomIndex = curr.random == null ? null : indexMap.get(curr.random);
            System.out.print("[" + curr.val + "," + randomIndex + "]");
            if (curr.next != null) System.out.print(",");
            curr = curr.next;
        }
        System.out.println("]");
    }




}
