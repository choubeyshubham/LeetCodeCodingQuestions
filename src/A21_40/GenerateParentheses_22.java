package A21_40;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    /*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]


     */

    public static void main(String[] args) {


    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(n, n, new StringBuilder(), ans);
        return ans;

    }
    private static void dfs(int l, int r, StringBuilder sb, List<String> ans) {
        if (l == 0 && r == 0) {
            ans.add(sb.toString());
            return;
        }

        if (l > 0) {
            sb.append("(");
            dfs(l - 1, r, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (l < r) {
            sb.append(")");
            dfs(l, r - 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


}
