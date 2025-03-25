package A61_80;

public class Searcha2DMatrix_74 {
    /*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.



Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true


     */


    public static void main(String[] args) {


    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;

        final int m = matrix.length;
        final int n = matrix[0].length;
        int l = 0;
        int r = m * n;

        while (l < r) {
            final int mid = (l + r) / 2;
            final int i = mid / n;
            final int j = mid % n;
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target)
                l = mid + 1;
            else
                r = mid;
        }

        return false;
    }



}
