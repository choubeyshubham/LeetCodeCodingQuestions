package A101_120;

import A81_100.TreeNode;

public class BalancedBinaryTree_110 {
    /*
Given a binary tree, determine if it is height-balanced.



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true


Constraints:

The number of nodes in the tree is in the range [0, 5000].
     */


    public static void main(String[] args) {



    }

    public static boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    // Returns the height of root if root is balanced; otherwise, returns -1.
    private static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        final int left = maxDepth(root.left);
        if (left == -1)
            return -1;
        final int right = maxDepth(root.right);
        if (right == -1)
            return -1;
        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }






}
