package A61_80;

public class SetMatrixZeroes_73 {
    /*

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.



Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]


     */

    public static void main(String[] args) {




    }

    public static void setZeroes(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        boolean shouldFillFirstRow = false;
        boolean shouldFillFirstCol = false;

        for (int j = 0; j < n; ++j)
            if (matrix[0][j] == 0) {
                shouldFillFirstRow = true;
                break;
            }

        for (int i = 0; i < m; ++i)
            if (matrix[i][0] == 0) {
                shouldFillFirstCol = true;
                break;
            }

        // Store the information in the first row and the first column.
        for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }

        // Fill 0s for the matrix except the first row and the first column.
        for (int i = 1; i < m; ++i)
            for (int j = 1; j < n; ++j)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        // Fill 0s for the first row if needed.
        if (shouldFillFirstRow)
            for (int j = 0; j < n; ++j)
                matrix[0][j] = 0;

        // Fill 0s for the first column if needed.
        if (shouldFillFirstCol)
            for (int i = 0; i < m; ++i)
                matrix[i][0] = 0;
    }


}
