/*
 * @lc app=leetcode.cn id=1004 lang=java
 *
 * [1004] 最大连续1的个数 III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int[][] f = new int[2][k + 1]; 
        int a = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (nums[i - 1] == 1) {
                    f[i & 1][j] = f[(i - 1) & 1][j] + 1;
                } else {
                    f[i & 1][j] = j == 0 ? 0 : f[(i - 1) & 1][j - 1] + 1;
                }
                a = Math.max(a, f[i & 1][j]);
            }
        }
        return a;

    }
}
// @lc code=end

