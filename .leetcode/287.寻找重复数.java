/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int m = 1;
        int n = nums.length - 1;
        while (m < n) {
            int g = (m + n) / 2;
            int k = 0;
            for (int num : nums) {
                if (num <= g) {
                    k++;
                }
            }
            if (k > g) {
                n = g;
            } else {
                m = g + 1;
            }
        }
        return m;
    }
}

// @lc code=end

