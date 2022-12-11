/*
 * @lc app=leetcode.cn id=2054 lang=java
 *
 * [2054] 两个最好的不重叠活动
 */

// @lc code=start
class Solution {
    public int maxTwoEvents(int[][] events) {
        int m = events.length;
        int[][] a = new int[2 * m][3];
        int index = 0;
        for (int[] event : events) {
            a[index++] = new int[]{event[0], 0, event[2]};
            a[index++] = new int[]{event[1], 1, event[2]};
        }
        Arrays.sort(a, (o1, o2) -> (o1[0] ^ o2[0]) == 0 ? o1[1] - o2[1] : o1[0] - o2[0]);
        int c = 0;
        int b = 0;
        for (int i = 0; i < 2 * m; i++) {
            int x = a[i][0], y = a[i][1], z = a[i][2];
            if (y == 1)
                c = Math.max(c, z);
            if (y == 0)
                b = Math.max(b, c + z);
        }
        return b;
    }
}

// @lc code=end

