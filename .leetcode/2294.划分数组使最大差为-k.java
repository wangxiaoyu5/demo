import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2294 lang=java
 *
 * [2294] 划分数组使最大差为 K
 */

// @lc code=start
class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int m = 0;
        int l = 0;
        int r = 0;
        while (r < n){
            if (nums[l] + k >= nums[r]){
                r ++;
            }
            else{
                m ++;
                l = r;
                r ++;
            }
        }
        if (l < r){
            m ++;
        }
        return m;
    }
}


// @lc code=end

