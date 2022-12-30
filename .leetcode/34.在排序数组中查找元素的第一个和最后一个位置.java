/*
 * @lc app=leetcode.cn id=34 lang=java
 *
 * [34] 在排序数组中查找元素的第一个和最后一个位置
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] x = {-1,-1};
        if(nums.length==0){
            return x;
        }
        int l = 0,r = nums.length-1;
        int m = 0;
       
        while(l<=r){
            m = l+(r-l)/2;
            if(nums[m]==target){
                x[0] = m;
                x[1] = m;
                break;
            }else if(target>nums[m]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        int t = m;
        while(t>=0&&nums[t]==target){
            x[0] = t;
            t--;
        }
        t = m;
        while(t<nums.length&&nums[t]==target){
          
            x[1]= t;
            t++;
        }
        return x;
    }
}


// @lc code=end

