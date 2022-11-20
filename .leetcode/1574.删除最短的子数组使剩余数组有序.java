/*
 * @lc app=leetcode.cn id=1574 lang=java
 *
 * [1574] 删除最短的子数组使剩余数组有序
 */

// @lc code=start
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int len = arr.length;
		int r = 1;
		while (r < len && arr[r] >= arr[r - 1]) {
			r++;
		}
		if (r == len) {
			return 0;
		}
		int l = len - 2;
		while (arr[l] <= arr[l + 1]) {
			l--;
		}
		int a = Integer.MAX_VALUE;
		for (int i = l + 1, j = 0; i < arr.length; i++) {
			for (; j < r && arr[j] <= arr[i]; j++) {

			}
			a = Math.min(a, i - j);
		}
		a = Math.min(a, Math.min(len - r, l + 1));
		return a;
	}

}


 
// @lc code=end

