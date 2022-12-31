/*
 * @lc app=leetcode.cn id=2517 lang=java
 *
 * [2517] 礼盒的最大甜蜜度
 */

// @lc code=start
class Solution {
    public int maximumTastiness(int[] price, int k) {
        int l = price.length;
        Arrays.sort(price);
        int[] x = new int[l];
        for (int i = 1; i < l; i++) {
            x[i] = price[i] - price[i - 1];
        }
        
        int m = Integer.MAX_VALUE;
        int n = 0;
        while (n < m) {
            int t = (m + n) / 2;
            int q = getGroupCnt(x, t);
            if (q < k) {
                
                m = t;
            } else {
                
                n = t + 1;
            }
        }
        return m - 1;
    }

    private int getGroupCnt(int[] x, int t) {
        int a = 1;
        int b = 0;
        for (int d : x) {
            b += d;
            if (b >= t) {
                a++;
                b = 0;
            }
        }
        return a;
    }
}

  
// @lc code=end

