import java.util.Arrays;

/* 
 *
 * [2411] 按位或最大的最小子数组长度
 */

// @lc code=start
class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] m = new int[32];
        Arrays.fill(m, -1);
        int[] z = new int[n];
        for (int i = n-1; i >= 0; i--) {
            int max = 1;
            for (int j = 0; j < 32; j++) {
                if (((nums[i] >> j) & 1) == 1) {
                    m[j] = i;
                }
                if (m[j] != -1) {
                    max = Math.max(max, m[j]-i+1);
                }
            }
            z[i] = max;
        }
        return z;
    }
}
// @lc code=end

