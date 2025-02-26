package A41_60;

public class NQueensII_52 {
    /*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return the number of distinct solutions to the n-queens puzzle.



Example 1:


Input: n = 4
Output: 2
Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
Example 2:

Input: n = 1
Output: 1


Constraints:

1 <= n <= 9

     */
    public static void main(String[] args) {



    }
    public static int totalNQueens(int n) {
        dfs(n, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return ans;
    }

    private static int ans = 0;

    private static void dfs(int n, int i, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (i == n) {
            ++ans;
            return;
        }

        for (int j = 0; j < cols.length; ++j) {
            if (cols[j] || diag1[i + j] || diag2[j - i + n - 1])
                continue;
            cols[j] = diag1[i + j] = diag2[j - i + n - 1] = true;
            dfs(n, i + 1, cols, diag1, diag2);
            cols[j] = diag1[i + j] = diag2[j - i + n - 1] = false;
        }
    }



}
