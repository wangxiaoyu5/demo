/*
 * @lc app=leetcode.cn id=1460 lang=java
 *
 * [1460] 通过翻转子数组使两个数组相等
 */

// @lc code=start
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length, m = 0;
        int[] g = new int[1010]; 
        for (int i = 0; i < n; i++) {
            if (++g[target[i]] == 1)
                m++;
            if (--g[arr[i]] == 0) 
                m--;
        }
        return m == 0;
    }
}
// @lc code=end

