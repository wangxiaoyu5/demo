/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int m = 0;
        int n = nums.length-1;
        while(m<n){ 
            int g = (m+n+1)/2;
            if(nums[g]>nums[g-1]){
                m = g;
            }else{
                n = g-1;
            }
        }
        return m;

    }
}


// @lc code=end

