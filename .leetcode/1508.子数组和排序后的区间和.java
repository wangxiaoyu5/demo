/*
 * @lc app=leetcode.cn id=1508 lang=java
 *
 * [1508] 子数组和排序后的区间和
 */

// @lc code=start
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int m = 1000000007;
        int t = n * (n + 1) / 2;
        int[] s = new int[t];
        int index = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                s[index++] = sum;
            }
        }
        Arrays.sort(s);
        int a = 0;
        for (int i = left - 1; i < right; i++) {
            a = (a + s[i]) % m;
        }
        return a;
    }
}


// @lc code=end

