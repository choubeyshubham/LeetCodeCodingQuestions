package A81_100;

public class DecodeWays_91 {
/*
You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:

"1" -> 'A'

"2" -> 'B'

...

"25" -> 'Y'

"26" -> 'Z'

However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25").

For example, "11106" can be decoded into:

"AAJF" with the grouping (1, 1, 10, 6)
"KJF" with the grouping (11, 10, 6)
The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
Note: there may be strings that are impossible to decode.

Given a string s containing only digits, return the number of ways to decode it. If the entire string cannot be decoded in any valid way, return 0.

The test cases are generated so that the answer fits in a 32-bit integer.



Example 1:

Input: s = "12"

Output: 2

Explanation:

"12" could be decoded as "AB" (1 2) or "L" (12).

Example 2:

Input: s = "226"

Output: 3

Explanation:

"226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */

    public static void main(String[] args) {



    }
    public static int numDecodings(String s) {
        final int n = s.length();
        // dp[i] := the number of ways to decode s[i..n)
        int[] dp = new int[n + 1];
        dp[n] = 1; // ""
        dp[n - 1] = isValid(s.charAt(n - 1)) ? 1 : 0;

        for (int i = n - 2; i >= 0; --i) {
            if (isValid(s.charAt(i)))
                dp[i] += dp[i + 1];
            if (isValid(s.charAt(i), s.charAt(i + 1)))
                dp[i] += dp[i + 2];
        }

        return dp[0];
    }

    private static boolean isValid(char c) {
        return c != '0';
    }

    private static boolean isValid(char c1, char c2) {
        return c1 == '1' || c1 == '2' && c2 < '7';
    }




}
