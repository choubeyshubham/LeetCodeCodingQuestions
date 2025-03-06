package A41_60;

public class SpiralMatrix_II_59 {
    /*
Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.



Example 1:


Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]


     */

    public static void main(String[] args) {



    }
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;

        for (int mn = 0; mn < n / 2; ++mn) {
            final int mx = n - mn - 1;
            for (int i = mn; i < mx; ++i)
                ans[mn][i] = count++;
            for (int i = mn; i < mx; ++i)
                ans[i][mx] = count++;
            for (int i = mx; i > mn; --i)
                ans[mx][i] = count++;
            for (int i = mx; i > mn; --i)
                ans[i][mn] = count++;
        }

        if (n % 2 == 1)
            ans[n / 2][n / 2] = count;

        return ans;
    }

}
