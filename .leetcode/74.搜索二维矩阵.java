/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1, n = 0;
        while (m >= 0 && n < matrix[0].length) {
            int num = matrix[m][n];
            if (num == target) {
                return true;
            } else if (num > target) {
                m--;
            } else {
                n++;
            }
        }
        return false;
    }
}


// @lc code=end

