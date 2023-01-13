/*
 * @lc app=leetcode.cn id=154 lang=java
 *
 * [154] 寻找旋转排序数组中的最小值 II
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int a = 0;
        int b = nums.length - 1;
        while (a < b) {
            int x = a + (b - a) / 2;
            if (nums[x] < nums[b]) {
                b = x;
            } else if (nums[x] > nums[b]) {
                a = x + 1;
            } else {
                b -= 1;
            }
        }
        return nums[a];
    }
}
// @lc code=end

