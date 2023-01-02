/*
 * @lc app=leetcode.cn id=456 lang=java
 *
 * [456] 132 模式
 */

// @lc code=start
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] x = new int[n];
        int t = -1;
        int m = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0 ; --i) {
            if (nums[i] < m)
                return true;
            while (t > -1 && x[t] < nums[i]) {
                m = x[t--];
            }
            if (nums[i] > m)
                x[++t] = nums[i];
        }
        return false;
    }
}

// @lc code=end

