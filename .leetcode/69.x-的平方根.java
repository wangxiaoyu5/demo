/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int  m= 0,r = x ,a = -1;
        while (m <= r) {
            int k = m + (r - m) / 2;
            if ((long) k * k <= x) {
                a = k;
                m = k + 1;
            } else {
                r = k - 1;
            }
        }
        return a;
    }
}


// @lc code=end

