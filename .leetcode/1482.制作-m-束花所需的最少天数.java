/*
 * @lc app=leetcode.cn id=1482 lang=java
 *
 * [1482] 制作 m 束花所需的最少天数
 */

// @lc code=start
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) {
            return -1;
        }
        int a = Integer.MAX_VALUE, b = 0;
        int e = bloomDay.length;
        for (int i = 0; i < e; i++) {
            a = Math.min(a, bloomDay[i]);
            b = Math.max(b, bloomDay[i]);
        }
        while (a < b) {
            int c = (b - a) / 2 + a;
            if (canMake(bloomDay, c, m, k)) {
                b = c;
            } else {
                a = c + 1;
            }
        }
        return a;
    }

    public boolean canMake(int[] bloomDay, int days, int m, int k) {
        int x = 0;
        int y = 0;
        int e = bloomDay.length;
        for (int i = 0; i < e && x < m; i++) {
            if (bloomDay[i] <= days) {
                y++;
                if (y == k) {
                    x++;
                    y = 0;
                }
            } else {
                y = 0;
            }
        }
        return x >= m;
    }
}


// @lc code=end

