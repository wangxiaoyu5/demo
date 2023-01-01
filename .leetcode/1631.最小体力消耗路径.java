/*
 * @lc app=leetcode.cn id=1631 lang=java
 *
 * [1631] 最小体力消耗路径
 */

// @lc code=start
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        boolean[][] t = new boolean[n][m];
        int[][] v = new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(v[i],1<<30);
        v[0][0]=0;
        int[] g = new int[]{-1,0,1,0}, h = new int[]{0,-1,0,1};
        for(int k=0;k<n*m-1;k++){
            int a = -1, b=-1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(!t[i][j]&&(a==-1||v[a][b]>v[i][j])){
                        a = i;b=j;
                    }
                }
            }
            t[a][b] = true;
            
            for(int j=0;j<4;j++){
                int x = a+g[j], y = b+h[j];
                if(x>=0&&x<n&&y>=0&&y<m)
                v[x][y] = Math.min(v[x][y],Math.max(v[a][b],Math.abs(heights[a][b]-heights[x][y])));
            }
            
        }
        return v[n-1][m-1];
    }
}


// @lc code=end

