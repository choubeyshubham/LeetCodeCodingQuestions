package A41_60;

import java.util.Arrays;

public class MaximumSubarray_53 {
    /*
Given an integer array nums, find the subarray with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     */

    public static void main(String[] args)
    {

        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        // dp[i] := the maximum sum subarray ending in i
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        for (int i = 1; i < nums.length; ++i)
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);

        return Arrays.stream(dp).max().getAsInt();
    }




}
