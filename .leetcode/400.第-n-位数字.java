/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第 N 位数字
 */

// @lc code=start
class Solution {
    public int findNthDigit(int n) {
        int k = 1;
        int g = 1;
        long a = 9;
        while(n>a){            
            g *= 10;
            k++;
            n -=a;
            a = 9L * g * k;
        }
        
        if(n%k==0){
            return (g + n/k -1)%10;
        }
        int t = g + n/k;
        int m = k-n%k;
        while(m>0){
            t/=10;
            m--;
        }
        return t%10;
        
    }
}

// @lc code=end

