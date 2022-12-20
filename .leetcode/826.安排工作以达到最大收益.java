/*
 * @lc app=leetcode.cn id=826 lang=java
 *
 * [826] 安排工作以达到最大收益
 */

// @lc code=start
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int y = 0;
        int n = difficulty.length, m = worker.length;
        int[][] x = new int[n][2];
        for (int i = 0; i < n; i++) {
            x[i][0] = difficulty[i];
            x[i][1] = profit[i];
        }
        Arrays.sort(x, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return b[1] - a[1];
            }
        });
        for (int i = 1; i < n; i++) {
            x[i][1] = Math.max(x[i][1], x[i - 1][1]);
        }
        Arrays.sort(worker);
        for (int i = n - 1, j = m - 1; i >= 0 && j >= 0; j--) {
            while (i >= 0 && x[i][0] > worker[j]) {
                i--;
            }
            if (i >= 0) {
                y += x[i][1];
            }
        }
        return y;
    }
}

// @lc code=end

