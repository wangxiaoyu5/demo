/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int m = 0, n = nums.length - 1;
        while(m<=n) {
            int h = m + (n - m) / 2;
            if(nums[h] == target) {
                return h;
            } else if(nums[h] > target) {
                n = h - 1;
            } else {
                m = h + 1;
            }
        }
        return -1;
    }
}

 
// @lc code=end

