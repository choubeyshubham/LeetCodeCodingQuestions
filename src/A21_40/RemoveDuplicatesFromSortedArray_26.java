package A21_40;

public class RemoveDuplicatesFromSortedArray_26 {
    /*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
     */

    public static void main(String[] args) {




    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;
        return i;
    }



}
