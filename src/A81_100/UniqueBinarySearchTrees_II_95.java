package A81_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of unique values from 1 to n. Return the answer in any order.



Example 1:


Input: n = 3
Output: [[1,null,2,null,3],[1,null,3,2],[2,1,3],[3,1,null,null,2],[3,2,null,1]]
Example 2:

Input: n = 1
Output: [[1]]


 */
public class UniqueBinarySearchTrees_II_95 {

    public static void main(String[] args) {



    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0)
            return new ArrayList<>();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int mn, int mx) {
        if (mn > mx)
            return Arrays.asList((TreeNode) null);

        List<TreeNode> ans = new ArrayList<>();

        for (int i = mn; i <= mx; ++i)
            for (TreeNode left : generateTrees(mn, i - 1))
                for (TreeNode right : generateTrees(i + 1, mx)) {
                    ans.add(new TreeNode(i));
                    ans.get(ans.size() - 1).left = left;
                    ans.get(ans.size() - 1).right = right;
                }

        return ans;
    }




}
