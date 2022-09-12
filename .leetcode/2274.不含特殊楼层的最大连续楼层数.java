import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2274 lang=java
 *
 * [2274] 不含特殊楼层的最大连续楼层数
 */

// @lc code=start
class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
      Arrays.sort(special);
      int n = special.length, m = special[0] - bottom;
      for (int i = 1; i < n; i++) {
        m = Math.max(m, special[i] - special[i - 1] - 1);
      }
      m = Math.max(m, top - special[n - 1]);
      return m;
    }
}


    

// @lc code=end

