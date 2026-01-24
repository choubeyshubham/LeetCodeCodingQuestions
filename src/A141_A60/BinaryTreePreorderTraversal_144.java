package A141_A60;

import A81_100.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_144 {
    /*
Given the root of a binary tree, return the preorder traversal of its nodes' values.



Example 1:

Input: root = [1,null,2,3]

Output: [1,2,3]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [1,2,4,5,6,7,3,8,9]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]



Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively?


     */

    static void main() {




    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    private static void preorder(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }



}
