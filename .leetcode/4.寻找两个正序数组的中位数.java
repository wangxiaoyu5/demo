/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个正序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int g = nums1.length + nums2.length;
        int a = -1, b = -1;
        int i = 0, j = 0;
        while (i + j - 1 != g / 2) {
            a = b;
            if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
                b = nums1[i++];
            }else {
                b = nums2[j++];
            }
        }
        if (g % 2 == 0) {
            return (double) (a + b) / 2;
        }
        return b;
    }
}

      
 
// @lc code=end

