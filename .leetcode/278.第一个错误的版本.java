/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int m = 1, k = n;
        while (m < k) {
            int h = m + (k - m) / 2; 
            if (isBadVersion(h)) {
                k = h; 
            } else {
                m = h + 1; 
            }
        }
        return m;
    }
}
    
// @lc code=end

