package A0_20;

public class PalindromeNumber09 {

    /*
Given an integer x, return true if x is a
palindrome
, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
     */

    public static void main(String[] args) {



    }


    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }



}
