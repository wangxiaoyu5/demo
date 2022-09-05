import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2160 lang=java
 *
 * [2160] 拆分数位后四位数字的最小和
 */

// @lc code=start
class Solution {
    public int minimumSum(int num) {
        int[] h = new int[4];
        int g = 0;
        while (num != 0){
            h[g++] = num % 10;
            num = num / 10;
        }

        Arrays.sort(h);

        int a = h[0] * 10 + h[2];
        int b = h[1] * 10 + h[3];
        num = a + b;

        return num ;


    }
}

// @lc code=end

