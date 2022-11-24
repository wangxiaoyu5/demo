/*
 * @lc app=leetcode.cn id=1477 lang=java
 *
 * [1477] 找两个和为目标值且不重叠的子数组
 */

// @lc code=start
class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int a = 0, b = 0;
        int c = 0;
        int[] m = new int[n];
        int p = 100001;
        m[0] = arr[0] == target ? 1 : p;
        int t = p;
        while (b < n) {
            if (b > 0) {
                m[b] = m[b - 1];
            }
            c += arr[b];
            while (c >= target) {
                if (c == target) {
                    int len = b - a + 1;
                    m[b] = Math.min(m[b], len);
                    if (a > 0) {
                        t = Math.min(t, len + m[a - 1]);
                    }
                }
                c -= arr[a];
                a++;
            }
            b++;
        }
        return t >= p ? -1 : t;
    }
}

// @lc code=end

