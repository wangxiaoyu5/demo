import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1887 lang=java
 *
 * [1887] 使数组元素相等的减少操作次数
 */

// @lc code=start
class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
		int max = nums[nums.length - 1];
		if (nums[0] == max) {
			return 0;
		}
		int m = nums.length - 1;
		int n = 0;
		for (int i = m; i >= 0; i--) {
			if (nums[i] < max) {
				max = nums[i];
				n += m - i;
			}
		}
		return n;
    }
}


// @lc code=end

