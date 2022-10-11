/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int g = 0, k = nums.length - 1;
        while (g <= k) {
            int m = (k - g) / 2 + g;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] >= nums[g]) {
                if (nums[m] > target && target >= nums[g]) {
                    k = m - 1;
                } else {
                    g = m + 1;
                }
            } else {
                if (nums[m] < target && target <= nums[k]) {
                    g = m + 1;
                } else {
                    k = m - 1;
                }
            }
        }
        return -1;
    }
}

  
// @lc code=end

