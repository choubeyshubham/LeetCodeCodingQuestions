package A21_40;

public class DivideTwoIntegers_29 {
    /*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be
 truncated to 8, and -2.7335 would be truncated to -2.
Return the quotient after dividing dividend by divisor.
Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer
range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1,
 and if the quotient is strictly less than -231, then return -231.
Example 1:
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.

     */

    public static void main(String[] args) {


        System.out.println(divide(10, -3));


    }
    public static int divide(long dividend, long divisor) {
        // Determine the sign of the result
        int sign = 1;
        if ((dividend < 0) != (divisor < 0)) {
            sign = -1;
        }

        // Use long to avoid integer overflow issues
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);

        // This will accumulate the result of the division
        long total = 0;

        // Loop to find how many times the divisor can be subtracted from the dividend
        while (longDividend >= longDivisor) {
            // This counter will keep track of the number of left shifts
            int count = 0;

            // Double the divisor until it is less than or equal to the dividend
            while (longDividend >= (longDivisor << (count + 1))) {
                count++;
            }

            // Add the number of times we could double the divisor to the total
            total += 1L << count;

            // Subtract the final doubled divisor value from the dividend
            longDividend -= longDivisor << count;
        }

        // Multiply the sign back into the total
        long result = sign * total;

        // Handle overflow cases by clamping to the Integer range
        if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
            return (int) result;
        }

        // If the result is still outside the range, return the max integer value
        return Integer.MAX_VALUE;
    }





}
