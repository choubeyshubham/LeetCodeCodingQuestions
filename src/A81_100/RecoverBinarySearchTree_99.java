package A81_100;

public class RecoverBinarySearchTree_99 {
    /*

Topics
premium lock icon
Companies
You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.



Example 1:


Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
Example 2:


Input: root = [3,1,4,null,null,2]
Output: [2,1,4,null,null,3]
Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.


     */
    public void recoverTree(TreeNode root) {
        inorder(root);
        swap(x, y);
    }

    private TreeNode pred = null;
    private TreeNode x = null; // the first wrong node
    private TreeNode y = null; // the second wrong node

    private void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);

        if (pred != null && root.val < pred.val) {
            y = root;
            if (x == null)
                x = pred;
            else
                return;
        }
        pred = root;

        inorder(root.right);
    }

    private void swap(TreeNode x, TreeNode y) {
        final int temp = x.val;
        x.val = y.val;
        y.val = temp;
    }

    public static void main(String[] args) {



    }






}
