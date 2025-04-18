package A61_80;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
    /*
Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.



Example 1:

Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
Example 2:

Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.



     */

    public static void main(String[] args) {
      int  n = 4, k = 2;

        System.out.println(combine(n, k));

    }


    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(int n, int k, int s, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = s; i <= n; ++i) {
            path.add(i);
            dfs(n, k, i + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }


}
