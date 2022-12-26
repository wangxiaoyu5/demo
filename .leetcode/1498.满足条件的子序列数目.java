/*
 * @lc app=leetcode.cn id=1498 lang=java
 *
 * [1498] 满足条件的子序列数目
 */

// @lc code=start
class Solution {
    public int numSubseq(int[] nums, int target) {
        int m = (int)1e9 + 7, n = nums.length;
        int[] f = new int[n];
        f[0] = 1;
        for (int i = 1; i < f.length; ++i) {
            f[i] = (f[i - 1] << 1) % m;
        }
       
        Arrays.sort(nums);
        int l = 0, r = n - 1;
        long ans = 0;
        while (l <= r) {
            int sum = nums[l] + nums[r];
            if (sum > target) {
                r--;
            } else {
                ans = (ans + f[r - l]) % m;
                l++;
            }
        }
        return (int)((ans + m) % m);
    }
}


// @lc code=end

