/*
 * @lc app=leetcode.cn id=1712 lang=java
 *
 * [1712] 将数组分成三个子数组的方案数
 */

// @lc code=start
class Solution {
    public int waysToSplit(int[] nums) {
        int n = nums.length;
        int[] m = new int[n + 1];
       
        for (int i = 1; i < n + 1; i++) {
            m[i] += nums[i - 1] + m[i - 1];
        }
        int a = 0;
        int b = 0;
        long c = 0;
        for (int i = 0; i < n - 2; i++) {
            a = Math.max(a, i + 1);
            while (a < n - 1 && m[a + 1] - m[i + 1] < m[i + 1]) {
                a++;
            }
            if (a == n - 1) {
                break;
            }
            b = Math.max(a, b);
            while (b < n - 1 && m[n] - m[b + 1] >= m[b + 1] - m[i + 1]) {
                b++;
            }
            c += b - a;
        }
        return (int) (c % ((int) 1e9 + 7));
    }
}


   
// @lc code=end

