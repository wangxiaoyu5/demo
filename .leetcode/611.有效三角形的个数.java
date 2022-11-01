/*
 * @lc app=leetcode.cn id=611 lang=java
 *
 * [611] 有效三角形的个数
 */

// @lc code=start
class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int w = j + 1, e = n - 1, k = j;
                while (w <= e) {
                    int g = (w + e) / 2;
                    if (nums[g] < nums[i] + nums[j]) {
                        k = g;
                        w = g + 1;
                    } else {
                        e = g - 1;
                    }
                }
                a += k - j;
            }
        }
        return a;
    }
}



   
// @lc code=end

