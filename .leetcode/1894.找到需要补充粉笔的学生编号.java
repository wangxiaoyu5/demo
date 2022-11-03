/*
 * @lc app=leetcode.cn id=1894 lang=java
 *
 * [1894] 找到需要补充粉笔的学生编号
 */

// @lc code=start
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long m = 0;
        for (int num : chalk) {
            m += num;
        }
        k %= m;
        int z = -1;
        for (int i = 0; i < n; ++i) {
            if (chalk[i] > k) {
                z = i;
                break;
            }
            k -= chalk[i];
        }
        return z;
    }
}
  
// @lc code=end

