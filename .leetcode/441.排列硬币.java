/*
 * @lc app=leetcode.cn id=441 lang=java
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int m = 1, h = n;
        while (m < h) {
            int k = (h - m + 1) / 2 + m;
            if ((long) k * (k + 1) <= (long) 2 * n) {
                m = k;
            } else {
                h = k - 1;
            }
        }
        return m;
    }
}


// @lc code=end

