/*
 * @lc app=leetcode.cn id=2231 lang=java
 *
 * [2231] 按奇偶性交换后的最大数字
 */

// @lc code=start
class Solution {
    public int largestInteger(int num) {
        int m = 0;
        int[] nums = new int[10];
        int len = 0;
        while (num > 0){
            nums[len++] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < len; i++){
            for (int j = i + 1; j < len; j++){
                if (nums[i] % 2 == 0 && nums[j] % 2 == 0 && nums[j] < nums[i]){
                    int h = nums[j];
                    nums[j] = nums[i];
                    nums[i] = h;
                }
                if (nums[i] % 2 != 0 && nums[j] % 2 != 0 && nums[j] < nums[i]){
                    int h = nums[j];
                    nums[j] = nums[i];
                    nums[i] = h;
                }
            }
        }
        for (int i = len-1; i >= 0; i--){
            m = m * 10 + nums[i];
        }
        return m;
    }
}


 
// @lc code=end

