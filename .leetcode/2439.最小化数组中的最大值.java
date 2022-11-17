/*
 * @lc app=leetcode.cn id=2439 lang=java
 *
 * [2439] 最小化数组中的最大值
 */

// @lc code=start
class Solution {
    public int minimizeArrayValue(int[] nums) {
        long m = (long) nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (m / i < nums[i]) {
                m += (long)nums[i];
                int t = (int) (m / (i + 1) + (m % (i + 1) == 0l ? 0l : 1l));
                if (nums[0] < t) {
                    nums[0] = t;
                }
            }else {
                m += nums[i];
            }
        }
        return nums[0];
    }
}


// @lc code=end

