/*
 * @lc app=leetcode.cn id=1954 lang=java
 *
 * [1954] 收集足够苹果的最小花园周长
 */

// @lc code=start
class Solution {
    public long minimumPerimeter(long neededApples) {
        long x = 1;
        long a = 0;
        while (8 * x * (x + 1) * 3 / 2 - 12 * x + a < neededApples){
            a += 8 * x * (x + 1) * 3 / 2 - 12 * x;
            x ++;
        }

        return 8 *x;
    }
}

// @lc code=end

