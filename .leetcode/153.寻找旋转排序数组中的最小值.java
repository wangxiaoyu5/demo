/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int m = 0;
        int n = nums.length - 1;
        while (m < n) {
            int g = m + (n - m) / 2;
            if (nums[g] > nums[n]) {          
                m = g + 1;
            } else {                                
                n = g;
            }
        }
        return nums[m];
    }
};

   
// @lc code=end

