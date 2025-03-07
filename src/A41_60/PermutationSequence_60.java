package A41_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence_60 {
    /*
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.



Example 1:

Input: n = 3, k = 3
Output: "213"

     */

    public static void main(String[] args) {


    }

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n + 1]; // fact[i] := i!

        for (int i = 1; i <= n; ++i)
            nums.add(i);

        Arrays.fill(fact, 1);
        for (int i = 2; i <= n; ++i)
            fact[i] = fact[i - 1] * i;

        --k; // 0-indexed

        for (int i = n - 1; i >= 0; --i) {
            final int j = k / fact[i];
            k %= fact[i];
            sb.append(nums.get(j));
            nums.remove(j);
        }

        return sb.toString();
    }


}
