package A41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens_51 {
    /*
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.



Example 1:


Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above

     */

    public static void main(String[] args) {

    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; ++i)
            Arrays.fill(board[i], '.');

        dfs(n, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1], board, ans);
        return ans;
    }

    private static void dfs(int n, int i, boolean[] cols, boolean[] diag1, boolean[] diag2, char[][] board,
                     List<List<String>> ans) {
        if (i == n) {
            ans.add(construct(board));
            return;
        }

        for (int j = 0; j < cols.length; ++j) {
            if (cols[j] || diag1[i + j] || diag2[j - i + n - 1])
                continue;
            board[i][j] = 'Q';
            cols[j] = diag1[i + j] = diag2[j - i + n - 1] = true;
            dfs(n, i + 1, cols, diag1, diag2, board, ans);
            cols[j] = diag1[i + j] = diag2[j - i + n - 1] = false;
            board[i][j] = '.';
        }
    }

    private static List<String> construct(char[][] board) {
        List<String> listBoard = new ArrayList<>();
        for (int i = 0; i < board.length; ++i)
            listBoard.add(String.valueOf(board[i]));
        return listBoard;
    }



}
