package A41_60;

public class FirstMissingPositive_41 {
    /*
    Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

     */

    public static void main(String[] args) {
        int[] arrr={1,2,0};
        System.out.println(firstMissingPositive(arrr));


    }
    public static int firstMissingPositive(int[] nums) {
        final int n = nums.length;

        // Correct slot:
        // nums[i] = i + 1
        // nums[i] - 1 = i
        // nums[nums[i] - 1] = nums[i]
        for (int i = 0; i < n; ++i)
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);

        for (int i = 0; i < n; ++i)
            if (nums[i] != i + 1)
                return i + 1;

        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
