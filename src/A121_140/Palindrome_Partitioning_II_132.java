package A121_140;

import java.util.Arrays;

public class Palindrome_Partitioning_II_132 {
    /*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.



Example 1:

Input: s = "aab"
Output: 1
Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.
Example 2:

Input: s = "a"
Output: 0
Example 3:

Input: s = "ab"
Output: 1


Constraints:

1 <= s.length <= 2000
s consists of lowercase English letters only.


     */

    static void main() {

    }

    public static int minCut(String s) {
        final int n = s.length();
        // isPalindrome[i][j] := true if s[i..j] is a palindrome
        boolean[][] isPalindrome = new boolean[n][n];
        for (boolean[] row : isPalindrome)
            Arrays.fill(row, true);
        // dp[i] := the minimum cuts needed for a palindrome partitioning of s[0..i]
        int[] dp = new int[n];
        Arrays.fill(dp, n);

        for (int l = 2; l <= n; ++l)
            for (int i = 0, j = l - 1; j < n; ++i, ++j)
                isPalindrome[i][j] = s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1];

        for (int i = 0; i < n; ++i) {
            if (isPalindrome[0][i]) {
                dp[i] = 0;
                continue;
            }

            // Try all the possible partitions.
            for (int j = 0; j < i; ++j)
                if (isPalindrome[j + 1][i])
                    dp[i] = Math.min(dp[i], dp[j] + 1);
        }

        return dp[n - 1];
    }




}
