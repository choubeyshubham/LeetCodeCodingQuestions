package A81_100;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram_84 {
    /*
Given an array of integers heights representing the histogram's bar height where
 the width of each bar is 1, return the area of the largest rectangle in the histogram.

Example 1:
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

     */

    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};

        System.out.println(largestRectangleArea(arr));


    }
    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <= heights.length; ++i) {
            while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] > heights[i])) {
                final int h = heights[stack.pop()];
                final int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, h * w);
            }
            stack.push(i);
        }

        return ans;
    }






}
