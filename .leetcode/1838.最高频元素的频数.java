/*
 * @lc app=leetcode.cn id=1838 lang=java
 *
 * [1838] 最高频元素的频数
 */

// @lc code=start
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        long t = 0;
        int l = 0, x = 1;
        for (int r = 1; r < n; ++r) {
            t += (long) (nums[r] - nums[r - 1]) * (r - l);
            while (t > k) {
                t -= nums[r] - nums[l];
                ++l;
            }
            x = Math.max(x, r - l + 1);
        }
        return x;
    }
}


// @lc code=end

