/*
 * @lc app=leetcode.cn id=2226 lang=java
 *
 * [2226] 每个小孩最多能分到多少糖果
 */

// @lc code=start
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int m=0;
        for (int d : candies) {
            m = Math.max(m,d);
        }
        int n = 1;
        while(n<=m){
            int t = (m+n)/ 2;
            long g = 0;
            for (int d : candies) {
                g+=d/t;
            }
            if(g>=k){
                n=t+1;
            }
            else {
                m=t-1;
            }
        }
        return m;
    }
}


// @lc code=end

