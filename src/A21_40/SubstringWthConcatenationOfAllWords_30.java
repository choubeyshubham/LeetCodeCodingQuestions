package A21_40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWthConcatenationOfAllWords_30 {
    /*
You are given a string s and an array of strings words. All the strings of words are of the same length.
A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd", and "efcdab" are all concatenated strings. "acdbef" is not a concatenated string because it is not the concatenation of any permutation of words.
Return an array of the starting indices of all the concatenated substrings in s. You can return the answer in any order.
Example 1:
Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
     */

    public static void main(String[] args) {



    }
    public static List<Integer> findSubstring(String s, String[] words) {
        if (s.isEmpty() || words.length == 0)
            return new ArrayList<>();

        final int k = words.length;
        final int n = words[0].length();
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();

        for (final String word : words)
            count.merge(word, 1, Integer::sum);

        for (int i = 0; i <= s.length() - k * n; ++i) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            for (; j < k; ++j) {
                final String word = s.substring(i + j * n, i + j * n + n);
                seen.merge(word, 1, Integer::sum);
                if (seen.get(word) > count.getOrDefault(word, 0))
                    break;
            }
            if (j == k)
                ans.add(i);
        }

        return ans;
    }





}
