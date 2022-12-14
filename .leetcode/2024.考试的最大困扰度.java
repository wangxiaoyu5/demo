/*
 * @lc app=leetcode.cn id=2024 lang=java
 *
 * [2024] 考试的最大困扰度
 */

// @lc code=start
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i = 0, n = answerKey.length(), t = 0, f = 0, m = 0;
        for (int j = 0; j < n; j++) {
            m = Math.max(m, answerKey.charAt(j) == 'T' ? ++t : ++f);
            if (j - i + 1 > m + k) {
                if (answerKey.charAt(i++) == 'T') {
                    t--;
                } else {
                    f--;
                }
            }
        }
        return n - i;
    }
}


  
// @lc code=end

