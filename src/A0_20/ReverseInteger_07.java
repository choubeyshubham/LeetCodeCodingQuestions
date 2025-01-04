package A0_20;

public class ReverseInteger_07 {

    /*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321
     */

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));

    }
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) ? 0 : (int) rev;
    }


}
