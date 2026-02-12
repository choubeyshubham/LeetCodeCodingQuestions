package A141_A60;

import A81_100.TreeNode;

public class BinaryTreeUpsideDown_156 {
/*




 */

    static void main() {



    }
    public static TreeNode upsideDownBinaryTree(TreeNode root) {
        TreeNode prevRoot = null;
        TreeNode prevRightChild = null;

        while (root != null) {
            TreeNode nextRoot = root.left; // Cache the next root.
            root.left = prevRightChild;
            prevRightChild = root.right;
            root.right = prevRoot;
            prevRoot = root; // Record the previous root.
            root = nextRoot; // Update the root.
        }

        return prevRoot;
    }



}
