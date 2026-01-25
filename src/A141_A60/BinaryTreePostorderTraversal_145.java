package A141_A60;

import A81_100.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {
    /*
Given the root of a binary tree, return the postorder traversal of its nodes' values.



Example 1:

Input: root = [1,null,2,3]

Output: [3,2,1]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,6,7,5,2,9,8,3,1]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]


     */

    static void main() {


    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }

    private static void postorder(TreeNode root, List<Integer> ans) {
        if (root == null)
            return;

        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }






}
