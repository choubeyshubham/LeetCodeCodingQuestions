package A81_100;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses_93 {
    /*
A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.



Example 1:

Input: s = "25525511135"
Output: ["255.255.11.135","255.255.111.35"]
Example 2:

Input: s = "0000"
Output: ["0.0.0.0"]



     */

    public static void main(String[] args) {



    }
    public static List<String> restoreIpAddresses(final String s) {
        List<String> ans = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(final String s, int start, List<String> path, List<String> ans) {
        if (path.size() == 4 && start == s.length()) {
            ans.add(String.join(".", path));
            return;
        }
        if (path.size() == 4 || start == s.length())
            return;

        for (int length = 1; length <= 3; ++length) {
            if (start + length > s.length()) // out-of-bounds
                return;
            if (length > 1 && s.charAt(start) == '0') // leading '0'
                return;
            final String num = s.substring(start, start + length);
            if (Integer.parseInt(num) > 255)
                return;
            path.add(num);
            dfs(s, start + length, path, ans);
            path.remove(path.size() - 1);
        }
    }



}
