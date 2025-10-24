package A101_120;


import A81_100.TreeNode;

public class PopulatingNextRightPointersInEachNode_II_117 {
    /*
Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.



Example 1:


Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
Example 2:

Input: root = []
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 6000].
-100 <= Node.val <= 100


Follow-up:

You may only use constant extra space.
The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.

     */

    public static void main(String[] args) {



    }

    public static TreeNode connect(TreeNode root) {
        TreeNode node = root; // the node that is above the current needling

        while (node != null) {
            TreeNode dummy = new TreeNode(); // a dummy node before needling
            // Needle the children of the node.
            for (TreeNode needle = dummy; node != null; node = node.next) {
                if (node.left != null) { // Needle the left child.
                    needle.next = node.left;
                    needle = needle.next;
                }
                if (node.right != null) { // Needle the right child.
                    needle.next = node.right;
                    needle = needle.next;
                }
            }
            node = dummy.next; // Move the node to the next level.
        }

        return root;
    }





}
