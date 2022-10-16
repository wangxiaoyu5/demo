/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        if (numbers == null) 
        return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = numbers[i] + numbers[j];
            if (m == target) {
                return new int[]{i + 1, j + 1};
            } else if (m < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
    
    
// @lc code=end

