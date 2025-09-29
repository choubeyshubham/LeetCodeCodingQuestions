package A101_120;

import A81_100.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
    /*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).



Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []


Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100

     */

    public static void main(String[] args) {


    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>(List.of(root));
        boolean isLeftToRight = true;

        while (!dq.isEmpty()) {
            List<Integer> currLevel = new ArrayList<>();
            for (int sz = dq.size(); sz > 0; --sz)
                if (isLeftToRight) {
                    TreeNode node = dq.pollFirst();
                    currLevel.add(node.val);
                    if (node.left != null)
                        dq.offerLast(node.left);
                    if (node.right != null)
                        dq.offerLast(node.right);
                } else {
                    TreeNode node = dq.pollLast();
                    currLevel.add(node.val);
                    if (node.right != null)
                        dq.offerFirst(node.right);
                    if (node.left != null)
                        dq.offerFirst(node.left);
                }
            ans.add(currLevel);
            isLeftToRight = !isLeftToRight;
        }

        return ans;
    }





}
