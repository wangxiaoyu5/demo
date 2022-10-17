/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] m = new int[nums.length];
        m[0] = 1;
        int n = 1;
        for (int i = 1; i < nums.length; i++) {
            m[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    m[i] = Math.max(m[i], m[j] + 1);
                }
            }
            n = Math.max(n, m[i]);
        }
        return n;
    }
}

  
// @lc code=end

