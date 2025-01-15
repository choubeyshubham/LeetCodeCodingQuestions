package A0_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
    /*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.



Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

     */
    public static void main(String[] args) {



    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        nSum(nums, 4, target, 0, nums.length - 1, new ArrayList<>(), ans);
        return ans;
    }
    private void nSum(int[] nums, long n, long target, int l, int r, List<Integer> path,
                      List<List<Integer>> ans) {
        if (r - l + 1 < n || target < nums[l] * n || target > nums[r] * n)
            return;
        if (n == 2) {
            // Similar to the sub procedure in 15. 3Sum
            while (l < r) {
                final int sum = nums[l] + nums[r];
                if (sum == target) {
                    path.add(nums[l]);
                    path.add(nums[r]);
                    ans.add(new ArrayList<>(path));
                    path.removeLast();
                    path.removeLast();
                    ++l;
                    --r;
                    while (l < r && nums[l] == nums[l - 1])
                        ++l;
                    while (l < r && nums[r] == nums[r + 1])
                        --r;
                } else if (sum < target) {
                    ++l;
                } else {
                    --r;
                }
            }
            return;
        }

        for (int i = l; i <= r; ++i) {
            if (i > l && nums[i] == nums[i - 1])
                continue;
            path.add(nums[i]);
            nSum(nums, n - 1, target - nums[i], i + 1, r, path, ans);
            path.removeLast();
        }
    }




}
