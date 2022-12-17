/*
 * @lc app=leetcode.cn id=2064 lang=java
 *
 * [2064] 分配给商店的最多商品的最小值
 */

// @lc code=start
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1 , r = 100005;
        while(l < r){
            int m = (l+r)>>1;
            int c = 0;
            for(int x : quantities){
                c += (x-1)/m+1;
            }
            if(c <= n){
                r = m;
            }else{
                l = m+1;
            }
        }
        return l;
    }
}



  
// @lc code=end

