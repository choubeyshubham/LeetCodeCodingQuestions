package A121_140;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak_139 {
    /*
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.



Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false


Constraints:

1 <= s.length <= 300
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 20
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.

     */


    static void main() {



    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        final int n = s.length();
        final int maxLength = getMaxLength(wordDict);
        Set<String> wordSet = new HashSet<>(wordDict);
        // dp[i] := true if s[0..i) can be segmented
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; ++i)
            for (int j = i - 1; j >= 0; --j) {
                if (i - j > maxLength)
                    break;
                // s[0..j) can be segmented and s[j..i) is in the wordSet, so s[0..i)
                // can be segmented.
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }

        return dp[n];
    }

    private static int getMaxLength(List<String> wordDict) {
        return wordDict.stream().mapToInt(String::length).max().getAsInt();
    }


}
