import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2285 lang=java
 *
 * [2285] 道路的最大总重要性
 */

// @lc code=start
class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[]m=new int[n];
        for(int i=0;i<roads.length;i++)
        {
            int k=roads[i][0];
            int a=roads[i][1];
            m[k]++;
            m[a]++;
        }
        Arrays.sort(m);
        long g=0;
        for(int i=n-1;i>=0;i--)
        {
            g+=(long)
            m[i]*n;
            n--;
        }
        return g;

    }
}


  
// @lc code=end

