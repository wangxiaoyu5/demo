/*
 * @lc app=leetcode.cn id=1027 lang=java
 *
 * [1027] 最长等差数列
 */

// @lc code=start
class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length, a = 0;
        int[][] m = new int[n][1010];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j] + 500;
                m[i][d] = Math.max(m[i][d], m[j][d] + 1);
                a = Math.max(a, m[i][d]);
            }
        }
        return a + 1;
    }

}

// @lc code=end

