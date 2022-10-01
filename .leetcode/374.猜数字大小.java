/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int g = 1, k = n;
        while (g < k) { 
            int m = g + (k - g) / 2; 
            if (guess(m) <= 0) {
                k = m; 
            } else {
                g = m + 1;
            }
        }
       
        return g;
    }
}
        
 
// @lc code=end

