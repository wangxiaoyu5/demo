/*
 * @lc app=leetcode.cn id=2358 lang=java
 *
 * [2358] 分组的最大数量
 */

// @lc code=start
class Solution {
    public int maximumGroups(int[] grades) {
        int m = grades.length;
        int i = 0; 
        while(m - i > i) {   
            m -= i;
            i++;
        }
        return i;
    }
}


// @lc code=end

