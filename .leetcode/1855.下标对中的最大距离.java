/*
 * @lc app=leetcode.cn id=1855 lang=java
 *
 * [1855] 下标对中的最大距离
 */

// @lc code=start
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int len = nums2.length;
        int b = 0;
        int t = 0;
        int m = 0;
        int a = 0;
        while(t < len) {
            int v = nums2[t];
            if(nums1[b] <= v) {
                m = t - b;
                a = Math.max(a,m);
            } else {
                m = 0;
                if(b < nums1.length-1) {
                    b++;
                }
            }
            t++;
        }
        return a;
    }
}

// @lc code=end

