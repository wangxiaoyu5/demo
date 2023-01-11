/*
 * @lc app=leetcode.cn id=378 lang=java
 *
 * [378] 有序矩阵中第 K 小的元素
 */

// @lc code=start
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int x = matrix.length, y = matrix[0].length;
        int[] a = new int[x * y];
        int b = 0;
        for (int[] c : matrix) {
            for (int n : c) {
                a[b++] = n;
            }
        }
        Arrays.sort(a);
        return a[k - 1];
    }
}


// @lc code=end

