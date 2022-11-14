/*
 * @lc app=leetcode.cn id=1292 lang=java
 *
 * [1292] 元素和小于等于阈值的正方形的最大边长
 */

// @lc code=start
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;
		long[][] g = new long[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
	          g[i][j] = g[i - 1][j] + g[i][j - 1] - g[i - 1][j - 1] + 1l * mat[i - 1][j - 1];
			}
		}
		int a = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int l = a, r = Math.min(m - i, n - j);
				while (l <= r) {
					int k = ((r - l) >> 1) + l;
					if (g[i + k][j + k] - g[i + k][j] - g[i][j + k] + g[i][j] <= threshold) {
						a = k;
						l = k + 1;
					} else {
						r = k - 1;
					}
				}
			}
		}
		return a;
	}
}


// @lc code=end

