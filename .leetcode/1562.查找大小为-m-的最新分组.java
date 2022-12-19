/*
 * @lc app=leetcode.cn id=1562 lang=java
 *
 * [1562] 查找大小为 M 的最新分组
 */

// @lc code=start
class Solution {
    public int findLatestStep(int[] arr, int m) {
        int n = arr.length;
        int[][] t = new int[n + 1][2];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(t[i], -1);
        }
        int h = 0;
        int z = -1;

        for (int i = 0; i < n; i++) {
            int a = arr[i], b = arr[i];
            if (arr[i] > 1 && t[arr[i] - 1][0] != -1) {
                a = t[arr[i] - 1][0];
                int x = t[arr[i] - 1][1] - t[arr[i] - 1][0] + 1;
                if (x == m) {
                    h--;
                }
            }
            if (arr[i] < n && t[arr[i] + 1][1] != -1) {
                b = t[arr[i] + 1][1];
                int y = t[arr[i] + 1][1] - t[arr[i] + 1][0] + 1;
                if (y == m) {
                    h--;
                }
            }
            int l = b - a + 1;
            if (l == m) {
                h++;
            }
            if (h > 0) {
                z = i + 1;
            }
            t[a][0] = t[b][0] = a;
            t[a][1] = t[b][1] = b;
        }
        return z;
    }
}


// @lc code=end

