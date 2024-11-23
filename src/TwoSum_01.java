import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_01 {
    /*
    Given an array of integers called nums and an integer target, return the indices
    of the two numbers such that they add up to target. It also says, that we can assume,
    that each input would have exactly one solution and that we cannot use the
     same element twice. Here are some examples given by the problem description.


     */

    public static void main(String[] args) {
    int[] num={2,7,11,15};
    int target=9;

        System.out.println(Arrays.toString(twoSumOn(num,target)));
        System.out.println("Explaination : Because "+num[0]+" + "+num[1]+" = "+target+", at index"+Arrays.toString(twoSumOn(num,target)));

        System.out.println(Arrays.toString(twoSumOn2(num,target)));
        System.out.println("Explaination : Because "+num[0]+" + "+num[1]+" = "+target+", at index"+Arrays.toString(twoSumOn2(num,target)));


    }

    public static int[] twoSumOn(int[] nums, int target) {
        // With complexity of O(n)

        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (numToIndex.containsKey(target - nums[i]))
                return new int[] {numToIndex.get(target - nums[i]), i};
            numToIndex.put(nums[i], i);
        }
        return new int[0];
    }

    public static int[] twoSumOn2(int[] nums, int target) {
    // With complexity of O(n2)
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[0];
    }



}
