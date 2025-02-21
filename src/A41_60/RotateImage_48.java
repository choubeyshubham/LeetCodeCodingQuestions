package A41_60;

public class RotateImage_48 {
    /*
ou are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

     */

    public static void main(String[] args) {


    }

    public static void rotate(int[][] matrix) {
        for (int i = 0, j = matrix.length - 1; i < j; ++i, --j) {
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }

        for (int i = 0; i < matrix.length; ++i)git
            for (int j = i + 1; j < matrix.length; ++j) {
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }
}