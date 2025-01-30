package A21_40;

import java.util.Arrays;

public class LongestValidParentheses_32 {

    /*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses 
substring
Example 1:
Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".



     */
    public static void main(String[] args) {



    }

    public static int longestValidParentheses(String s) {
        final String s2 = ")" + s;
        // dp[i] := the length of the longest valid parentheses in the substring
        // s2[1..i]
        int dp[] = new int[s2.length()];

        for (int i = 1; i < s2.length(); ++i)
            if (s2.charAt(i) == ')' && s2.charAt(i - dp[i - 1] - 1) == '(')
                dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;

        return Arrays.stream(dp).max().getAsInt();
    }


}
