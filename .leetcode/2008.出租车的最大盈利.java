/*
 * @lc app=leetcode.cn id=2008 lang=java
 *
 * [2008] 出租车的最大盈利
 */

// @lc code=start
class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        long[]g=new long[n+1];
         List<int[]>[] m=new ArrayList[n+1];
         for(int i=0;i<=n;i++){
             m[i]=new ArrayList<>();
         }
         for(var p:rides){
             int s=p[0];
             int t=p[1];
             int w=p[2];
             m[t].add(new int[]{s,t-s+w});
         }
         for(int i=1;i<=n;i++){
             g[i]=g[i-1];
             for(var p:m[i]){
                 g[i]=Math.max(g[i],g[p[0]]+p[1]);
             }
         }
         return g[n];
    }
}


// @lc code=end

