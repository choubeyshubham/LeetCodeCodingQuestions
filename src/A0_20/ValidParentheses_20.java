package A0_20;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses_20 {
    /*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

     */

    public static void main(String[] args) {



    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (final char c : s.toCharArray())
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;

        return stack.isEmpty();


    }




}
