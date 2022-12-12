/*
 * @lc app=leetcode.cn id=2250 lang=java
 *
 * [2250] 统计包含每个点的矩形数目
 */

// @lc code=start
class Solution {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        Arrays.sort(rectangles, (a, b) -> b[0] - a[0]);

        var n = points.length;
        var b = IntStream.range(0, n).boxed().toArray(Integer[]::new);
        Arrays.sort(b, (i, j) -> points[j][0] - points[i][0]);

        var a = new int[n];
        var c = new int[101];
        var i = 0;
        for (var id : b) {
            while (i < rectangles.length && rectangles[i][0] >= points[id][0])
                ++c[rectangles[i++][1]];
            for (var j = points[id][1]; j < c.length; ++j)
                a[id] += c[j];
        }
        return a;
    }
}

   
// @lc code=end

