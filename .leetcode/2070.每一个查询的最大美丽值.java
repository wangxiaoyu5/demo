/*
 * @lc app=leetcode.cn id=2070 lang=java
 *
 * [2070] 每一个查询的最大美丽值
 */

// @lc code=start
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (i1, i2) -> i1[0] - i2[0]);
        for (int i = 1; i < items.length; i++) {
            items[i][1] = Math.max(items[i-1][1], items[i][1]);
        }
        int[] a = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = 0, r = items.length;
            while (l < r) {
                int m = (r - l) / 2 + l;
                if (items[m][0] > queries[i]) r = m;
                else {
                    if ((m + 1 < items.length && items[m+1][0] > queries[i]) || m == items.length - 1) {
                        a[i] = items[m][1];
                        break;
                    }
                    l = m + 1;
                }
            }
        }
        return a;
    }
}


// @lc code=end

