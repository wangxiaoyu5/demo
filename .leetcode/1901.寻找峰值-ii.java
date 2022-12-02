/*
 * @lc app=leetcode.cn id=1901 lang=java
 *
 * [1901] 寻找峰值 II
 */

// @lc code=start
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = 0 ;
        int r[] =  new int[2] ;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                if (max< mat[i][j]){
                    r[0] = i ;
                    r[1] = j ;
                    max = mat[i][j] ;
                }
            }
        }
        return r ;
    }
}
// @lc code=end

