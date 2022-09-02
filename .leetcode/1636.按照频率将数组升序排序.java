/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 */

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        int[] count = new int[201];
		for (int i = 0 ;i < nums.length ;i++) {
            int m = nums[i];
			count[m + 100]++;
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (count[nums[i] + 100] > count[nums[j] + 100]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
				if (count[nums[i] + 100] == count[nums[j] + 100] && nums[j] > nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}

// @lc code=end

