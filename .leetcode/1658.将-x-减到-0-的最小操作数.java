import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1658 lang=java
 *
 * [1658] 将 x 减到 0 的最小操作数
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int x) {
        int m = -1;
        int s = Arrays.stream(nums).sum();
        int y = 0;
        int a = 0;
        int b = 0;
        while (a < nums.length) {
           
            if (b < nums.length) {
                y += nums[b++];
            }
            while (y > s - x && a < nums.length) {
                y -= nums[a++];
            }
            if (y == s - x) {
                m = Math.max(m, b - a);
            }
            if (b == nums.length) {
                a++;
            }
        }
        
        return m == -1 ? -1 : nums.length - m;
    }
}


// @lc code=end

