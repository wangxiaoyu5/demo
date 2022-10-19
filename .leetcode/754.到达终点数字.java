/*
 * @lc app=leetcode.cn id=754 lang=java
 *
 * [754] 到达终点数字
 */

// @lc code=start
class Solution {
    public int reachNumber(int target) {

        int sum= 0;
        int i =0;
        int a = Math.abs(target);
        while(sum<a||(sum-a)%2!=0){
            sum+=i;
            i++;
        }
        return i-1;
    }

}
  
// @lc code=end

