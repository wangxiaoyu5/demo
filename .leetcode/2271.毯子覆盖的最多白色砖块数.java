/*
 * @lc app=leetcode.cn id=2271 lang=java
 *
 * [2271] 毯子覆盖的最多白色砖块数
 */

// @lc code=start
class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        Arrays.sort(tiles, (a, b) -> a[0] - b[0]);
        int n = tiles.length;
        int i = 0;
        int j = 0;
        int a = 0;
        int b = 0;
        while (i < n) {
            int c = tiles[i][0] + carpetLen - 1;
            while (j < n && tiles[j][0] <= c) {
                b += Math.min(tiles[j][1], c) - tiles[j][0] + 1;
                j++;
            }
            a = Math.max(a, b);

            b -= tiles[i][1] - tiles[i][0] + 1;
            i++;
            
            if (tiles[j - 1][1] > c) {
                b -= c - tiles[j - 1][0] + 1;
                j--;
            }
        }
        return a;
    }
}

// @lc code=end

