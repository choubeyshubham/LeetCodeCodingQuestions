package A21_40;

public class CountAndSay_38 {
    /*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works by replacing consecutive
 identical characters (repeated 2 or more times) with the concatenation of the character and the number
 marking the count of the characters (length of the run). For example, to compress the string "3322251"
  we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11".
  Thus the compressed string becomes "23321511".

Given a positive integer n, return the nth element of the count-and-say sequence.



Example 1:

Input: n = 4

Output: "1211"

     */
    public static void main(String[] args) {



    }
    public static String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");

        while (--n > 0) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < sb.length(); ++i) {
                int count = 1;
                while (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                next.append(count).append(sb.charAt(i));
            }
            sb = next;
        }

        return sb.toString();
    }



}
