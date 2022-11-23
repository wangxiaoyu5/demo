/*
 * @lc app=leetcode.cn id=1283 lang=java
 *
 * [1283] 使结果不超过阈值的最小除数
 */

// @lc code=start
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int m = 1;
        int n = 0;
        for(int num:nums){
            n = Math.max(num,n);
        }

        while(m<n){
            int a = (n-m)/2+m;
            int b = 0;
            for(int num:nums){
                b += (num+a-1)/a;
            }
            if(b<=threshold){
                n = a;
            }else{
                m = a+1;
            }
        }

        return n;

    }
}
// @lc code=end

