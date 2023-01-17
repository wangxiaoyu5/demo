/*
 * @lc app=leetcode.cn id=887 lang=java
 *
 * [887] 鸡蛋掉落
 */

// @lc code=start
class Solution {
    public int superEggDrop(int k, int n) {
        if(n==1){
            return 1;
        }
        int[][] x = new int[k+1][n+1];
        int y=0;
        for(;x[k][y]<n;){ 
             y++;
            for (int i = k; i >=1; i--) { 
                x[i][y] = x[i-1][y-1]+x[i][y-1]+1;
            }
        }

        return y;
    }
}



// @lc code=end

