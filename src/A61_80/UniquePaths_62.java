package A61_80;

import java.util.Arrays;

public class UniquePaths_62 {
    /*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.



Example 1:


Input: m = 3, n = 7
Output: 28

     */

    public static void main(String[] args) {



    }

    public static int uniquePaths(int m, int n) {
        // dp[i][j] := the number of unique paths from (0, 0) to (i, j)
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(A -> Arrays.fill(A, 1));

        for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

        return dp[m - 1][n - 1];
    }




}
