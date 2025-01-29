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
        Map<String, Integer> wordCount = new HashMap<>();

        // Create and populate a map with the count of each unique word
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        int strLength = s.length(), numOfWords = words.length;
        int wordLength = words[0].length(); // Assume all words are the same length
        List<Integer> indices = new ArrayList<>();

        // Iterate over all possible word start indices to check for valid substrings
        for (int i = 0; i < wordLength; ++i) {
            Map<String, Integer> currentCount = new HashMap<>();
            int left = i, right = i;
            int totalWords = 0;

            // Expand the window to the right, adding words into current window count
            while (right + wordLength <= strLength) {
                String sub = s.substring(right, right + wordLength);
                right += wordLength;

                // If the word is not in the original word list, reset the window
                if (!wordCount.containsKey(sub)) {
                    currentCount.clear();
                    left = right;
                    totalWords = 0;
                    continue;
                }

                // Increase the count for the current word in the window
                currentCount.merge(sub, 1, Integer::sum);
                ++totalWords;

                // If a word count exceeds its count in wordCount, reduce from left side
                while (currentCount.get(sub) > wordCount.get(sub)) {
                    String removed = s.substring(left, left + wordLength);
                    left += wordLength;
                    currentCount.merge(removed, -1, Integer::sum);
                    --totalWords;
                }

                // If the total words reached the number of words, a valid substring is found
                if (totalWords == numOfWords) {
                    indices.add(left);
                }
            }
        }
        return indices;

    }





}
