import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2279 lang=java
 *
 * [2279] 装满石头的背包的最大数量
 */

// @lc code=start
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
            int n = capacity.length, m = 0;
            for (int i = 0; i < n; i++) {
              capacity[i] -= rocks[i];
            }
            Arrays.sort(capacity);
            for (int i = 0; i < n; i++) {
              additionalRocks -= capacity[i];
              if (additionalRocks < 0)
               break;
              m++;
            }
            return m;
          }

    }

// @lc code=end

