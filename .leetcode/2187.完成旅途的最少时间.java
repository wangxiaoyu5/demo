/*
 * @lc app=leetcode.cn id=2187 lang=java
 *
 * [2187] 完成旅途的最少时间
 */

// @lc code=start
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long l = 0;
        long r = (long)1e14;
        while (l < r){
            long m = l + r >> 1;
            long n = 0;
            for (int t: time){
                n += m / t;
            }
            if (n >= totalTrips){
                r = m;
            }
            else{
                l = m + 1;
            }
        }
        
        return l;
    }
}


// @lc code=end

