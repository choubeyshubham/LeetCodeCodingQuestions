package A21_40;

public class SearchInsertPosition_35 {
    /*
    Given a sorted array of distinct integers and a target value, return the index if the
     target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

     */

    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=5;

        System.out.println(searchInsert(arr,target));

    }
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length;

        while (l < r) {
            final int m = (l + r) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] < target)
                l = m + 1;
            else
                r = m;
        }

        return l;
    }


}
