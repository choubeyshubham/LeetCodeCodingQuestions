package A21_40;

import java.util.Arrays;

public class FindFirstAndLastPosition_34 {
    /*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4



     */


    public static void main(String[] args) {
      int[] nums = {5,7,7,8,8,10};
       int  target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));


    }

    public static int[] searchRange(int[] nums, int target) {
        final int l = firstGreaterEqual(nums, target);
        if (l == nums.length || nums[l] != target)
            return new int[] {-1, -1};
        final int r = firstGreaterEqual(nums, target + 1) - 1;
        return new int[] {l, r};
    }

    private static int firstGreaterEqual(int[] arr, int target) {
        int l = 0;
        int r = arr.length;
        while (l < r) {
            final int m = (l + r) / 2;
            if (arr[m] >= target)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }



}
