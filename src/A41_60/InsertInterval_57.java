package A41_60;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval_57 {
    /*
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a new array and return it.



Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

     */
    public static void main(String[] args) {



    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        final int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int i = 0;

        while (i < n && intervals[i][1] < newInterval[0])
            ans.add(intervals[i++]);

        // Merge overlapping intervals.
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            ++i;
        }

        ans.add(newInterval);

        while (i < n)
            ans.add(intervals[i++]);

        return ans.toArray(int[][] ::new);
    }



}
