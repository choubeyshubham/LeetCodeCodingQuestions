package A61_80;

public class EditDistance_72 {
    /*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:
Insert a character
Delete a character
Replace a character
Example 1:
Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation:
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')


     */

    public static void main(String[] args) {

        String word1 = "horse";
        String word2 = "ros";

        System.out.println(minDistance(word1, word2));



    }

    public static int minDistance(String word1, String word2) {
        final int m = word1.length();
        final int n = word2.length();
        // dp[i][j] := the minimum number of operations to convert word1[0..i) to
        // word2[0..j)
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; ++i)
            dp[i][0] = i;

        for (int j = 1; j <= n; ++j)
            dp[0][j] = j;

        for (int i = 1; i <= m; ++i)
            for (int j = 1; j <= n; ++j)
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min( (dp[i - 1][j - 1]), (Math.min(dp[i - 1][j], dp[i][j - 1])) ) + 1;

        return dp[m][n];
    }







}
