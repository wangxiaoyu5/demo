/*
 * @lc app=leetcode.cn id=2055 lang=java
 *
 * [2055] 蜡烛之间的盘子
 */

// @lc code=start
class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] m = new int[n];
        for (int i = 0, sum = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                sum++;
            }
            m[i] = sum;
        }
        int[] z = new int[n];
        for (int i = 0, l = -1; i < n; i++) {
            if (s.charAt(i) == '|') {
                l = i;
            }
            z[i] = l;
        }
        int[] a = new int[n];
        for (int i = n - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                r = i;
            }
            a[i] = r;
        }
        int[] b = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] f = queries[i];
            int x = a[f[0]], y = z[f[1]];
            b[i] = x == -1 || y == -1 || x >= y ? 0 : m[y] - m[x];
        }
        return b;
    }
}


// @lc code=end

