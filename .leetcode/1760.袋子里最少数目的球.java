/*
 * @lc app=leetcode.cn id=1760 lang=java
 *
 * [1760] 袋子里最少数目的球
 */

// @lc code=start
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int a = 0;
		int l = 1, r = 1000000000;
		while (l <= r) {
			int m = l + ((r - l) >> 1);
			int z = 0;
			for (int num : nums) {
				if (num > m) {
					z += num / m;
					if (num % m == 0) {
						z -= 1;
					}
					if (z > maxOperations) {
						break;
					}
				}
			}
			if (z > maxOperations) {
				l = m + 1;
			} else {
				a = m;
				r = m - 1;
			}
		}
		return a;
	}

    
}
// @lc code=end

