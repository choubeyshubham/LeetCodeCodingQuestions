public class StringToInteger_08 {

/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows:
Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached.
If no digits were read, then the result is 0.Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1],
then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers
greater than 231 - 1 should be rounded to 231 - 1.

Return the integer as the final result.
Example 1:
Input: s = "42"
Output: 42
Explanation:
The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
*/
    public static void main(String[] args) {
        String s = "42";

        System.out.println(method(s));



    }

    public static int method(String s) {
        s = s.strip();
        if (s.isEmpty())
            return 0;

        final int sign = s.charAt(0) == '-' ? -1 : 1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-')
            s = s.substring(1);

        long num = 0;

        for (final char c : s.toCharArray()) {
            if (!Character.isDigit(c))
                break;
            num = num * 10 + (c - '0');
            if (sign * num <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if (sign * num >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }

        return sign * (int) num;
    }



}
