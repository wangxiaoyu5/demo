import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=825 lang=java
 *
 * [825] 适龄的朋友
 */

// @lc code=start
class Solution {
    public int numFriendRequests(int[] ages) {
        int n = ages.length;
        Arrays.sort(ages);
        int v = 0, m = 0, a = 0;
        for (int age : ages) {
            if (age < 15) {
                continue;
            }
            while (ages[v] <= 0.5 * age + 7) {
                ++v;
            }
            while (m + 1 < n && ages[m + 1] <= age) {
                ++m;
            }
            a += m - v;
        }
        return a;
    }
}


   
// @lc code=end

