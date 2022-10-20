/*
 * @lc app=leetcode.cn id=540 lang=java
 *
 * [540] 有序数组中的单一元素
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int m = 0, n = nums.length - 1;
        while (m < n) {
            int h = (n - m) / 2 + m;
            if (nums[h] == nums[h ^ 1]) {
                m = h + 1;
            } else {
                n = h;
            }
        }
        return nums[m];
    }
}


// @lc code=end

