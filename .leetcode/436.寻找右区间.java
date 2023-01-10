/*
 * @lc app=leetcode.cn id=436 lang=java
 *
 * [436] 寻找右区间
 */

// @lc code=start
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = intervals[i][0];
            a[i][1] = i;
        }
        Arrays.sort(a, (o1, o2) -> o1[0] - o2[0]);

        int[] z = new int[n];
        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = n - 1;
            int t = -1;
            while (x <= y) {
                int g = (x + y) / 2;
                if (a[g][0] >= intervals[i][1]) {
                    t = a[g][1];
                    y = g - 1;
                } else {
                    x = g + 1;
                }
            }
            z[i] = t;
        }
        return z;
    }
}

// @lc code=end

