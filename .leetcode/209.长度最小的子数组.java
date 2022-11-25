/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, a = n + 10;
        int[] k = new int[n + 10];
        for (int i = 1; i <= n; i++) k[i] = k[i - 1] + nums[i - 1];
        for (int i = 1; i <= n; i++) {
            int s = k[i], d = s - target;
            int l = 0, r = i;
            while (l < r) {
                int p = l + r + 1 >> 1;
                if (k[p] <= d) l = p;
                else r = p - 1;
            }
            if (k[r] <= d) a = Math.min(a, i - r);
        }
        return a == n + 10 ? 0 : a;
    }
}

  
// @lc code=end

