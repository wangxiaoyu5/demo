/*
 * @lc app=leetcode.cn id=668 lang=java
 *
 * [668] 乘法表中第k小的数
 */

// @lc code=start
class Solution {
    public int findKthNumber(int m, int n, int k) {
        int a = 1, b = m * n;
        while (a < b) {
            int x = a + (b - a) / 2;
            int c = x / n * n;
            for (int i = x / n + 1; i <= m; ++i) {
                c += x / i;
            }
            if (c >= k) {
                b = x;
            } else {
                a = x + 1;
            }
        }
        return a;
    }

}

// @lc code=end

