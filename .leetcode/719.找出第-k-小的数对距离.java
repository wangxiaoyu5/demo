/*
 * @lc app=leetcode.cn id=719 lang=java
 *
 * [719] 找出第 K 小的数对距离
 */

// @lc code=start
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, a = 0, b = nums[n - 1] - nums[0];
        while (a <= b) {
            int x = (a + b) / 2;
            int t = 0;
            for (int i = 0, j = 0; j < n; j++) {
                while (nums[j] - nums[i] > x) {
                    i++;
                }
                t += j - i;
            }
            if (t >= k) {
                b = x - 1;
            } else {
                a = x + 1;
            }
        }
        return a;
    }
}

// @lc code=end

