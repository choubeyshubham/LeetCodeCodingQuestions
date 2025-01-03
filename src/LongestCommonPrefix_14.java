import java.util.Arrays;

public class LongestCommonPrefix_14 {
    /*



     */


    public static void main(String[] args) {
        String[] arr = { "geeksforgeeks", "geeks",
                "geek", "geezer" };
        System.out.println(longestCommonPrefix(arr));


    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());
        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) i++;
        return first.substring(0, i);
    }




}
