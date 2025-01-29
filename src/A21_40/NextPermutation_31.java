package A21_40;

public class NextPermutation_31 {
    /*
    A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.



Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]



     */


    public static void main(String[] args) {
        int[] arr={1,2,3};
        nextPermutation(arr);


    }
    public static void nextPermutation(int[] nums) {
        final int n = nums.length;

        // From back to front, find the first number < nums[i + 1].
        int i;
        for (i = n - 2; i >= 0; --i)
            if (nums[i] < nums[i + 1])
                break;

        // From back to front, find the first number > nums[i], swap it with
        // nums[i].
        if (i >= 0)
            for (int j = n - 1; j > i; --j)
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }

        // Reverse nums[i + 1..n - 1].
        reverse(nums, i + 1, n - 1);
        for (int g:nums){
            System.out.print(g+" ");
        }

    }

    private  static void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




}
