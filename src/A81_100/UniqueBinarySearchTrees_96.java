package A81_100;

public class UniqueBinarySearchTrees_96 {
    /*
Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.



Example 1:

Input: n = 3
Output: 5

Example 2:

Input: n = 1
Output: 1


     */

    public static void main(String[] args) {

    }
    public static int numTrees(int n) {
        // dp[i] := the number of unique BST's that store values 1..i
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; ++i)
            for (int j = 0; j < i; ++j)
                dp[i] += dp[j] * dp[i - j - 1];

        return dp[n];
    }


}
