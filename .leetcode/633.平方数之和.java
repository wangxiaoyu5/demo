/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        long m = 0;
        long n = (long) Math.sqrt(c);
        while (m <= n) {
            long j = m * m + n * n;
            if (j == c) {
                return true;
            } else if (j > c) {
                n--;
            } else {
                m++;
            }
        }
        return false;

    }
}
// @lc code=end

