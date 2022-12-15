/*
 * @lc app=leetcode.cn id=1648 lang=java
 *
 * [1648] 销售价值减少的颜色球
 */

// @lc code=start
class Solution {
    int m = (int) 1e9 + 7;

	public int maxProfit(int[] inventory, int orders) {
		int t = 0;
		for (int i = 0; i < inventory.length; i++) {
			t = Math.max(t, inventory[i]);
		}
		long l = 0, r = t;
		long c = 0;
		while (l <= r) {
			long a = l + ((r - l) >> 1);
			long s = 0;
			for (long n : inventory) {
				if (n > a) {
					long size = n - a;
					s += size;
				}
			}
			if (s >= orders) {
				c = a;
				l = a + 1;
			} else {
				r = a - 1;
			}
		}
		long s = 0;
		c += 1;
		long z = 0;
		for (long n : inventory) {
			if (n > c) {
				long y = n - c;
				s += y;
				z += ((n + c + 1) * y / 2) % m;
				z %= m;
			}
		}
		z += ((orders - s) * c) % m;
		z %= m;
		return (int) z;
	}
}

// @lc code=end

