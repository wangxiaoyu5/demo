/*
 * @lc app=leetcode.cn id=878 lang=java
 *
 * [878] 第 N 个神奇数字
 */

// @lc code=start
class Solution {
   
        private static final long m = (long) 1e9 + 7;

        public int nthMagicalNumber(int n, int a, int b) {
            long f = a / gcd(a, b) * b;
            long g = 0, h = (long) Math.min(a, b) * n; 
            while (g + 1 < h) { 
                long t = g + (h - g) / 2;
                if (t / a + t / b - t / f >= n)
                    h = t; 
                else
                    g = t; 
            }
            return (int) (h % m);
        }
    
        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }


// @lc code=end

