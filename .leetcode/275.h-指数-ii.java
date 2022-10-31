/*
 * @lc app=leetcode.cn id=275 lang=java
 *
 * [275] H 指数 II
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int m = 0, g = n - 1;
        while (m <= g) {
            int h = m + (g - m) / 2;
            if (citations[h] >= n - h) {
                g = h - 1;
            } else {
                m = h + 1;
            }
        }
        return n - m;
    }
}


// @lc code=end

