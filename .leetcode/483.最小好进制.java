/*
 * @lc app=leetcode.cn id=483 lang=java
 *
 * [483] 最小好进制
 */

// @lc code=start
class Solution {
    public String smallestGoodBase(String n) {
        long x = Long.parseLong(n);
        int y = (int) Math.floor(Math.log(x) / Math.log(2));
        for (int m = y; m > 1; m--) {
            int k = (int) Math.pow(x, 1.0 / m);
            long t = 1, p = 1;
            for (int i = 0; i < m; i++) {
                t *= k;
                p += t;
            }
            if (p == x) {
                return Integer.toString(k);
            }
        }
        return Long.toString(x - 1);
    }
}

// @lc code=end

