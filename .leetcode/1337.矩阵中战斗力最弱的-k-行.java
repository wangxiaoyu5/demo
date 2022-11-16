/*
 * @lc app=leetcode.cn id=1337 lang=java
 *
 * [1337] 矩阵中战斗力最弱的 K 行
 */

// @lc code=start
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] m = new int[mat.length];
        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[i].length - 1; j >= 0; j--) {
                if(mat[i][j] != 0) {
                    m[i] = j + 1;
                    break;
                }
            }
        }
        int n = 0 ;
        int z = 0;
        int[] a = new int[k];
        while(n != k) {
            for(int i = 0 ; i < m.length ; i++) {
                if(m[i] == z  ) {
                    a[n++] = i;
                }
                if(n == k) {
                    break;
                }
            }
            z++;
        }
        return a;
    }
}


// @lc code=end

