/*
 * @lc app=leetcode.cn id=1011 lang=java
 *
 * [1011] 在 D 天内送达包裹的能力
 */

// @lc code=start
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int m = weights[0], n = 0;
        for(int i = 0;i<weights.length;++i){
            if(weights[i] > m) m = weights[i];
            n += weights[i];
        }
        while(m <= n){
            int z = m + ((n - m)>>1);
            int a = 1;
            int b = 0;
            for(int weight : weights){
                if(b + weight > z){
                    a++;
                    b = 0;
                }
                b += weight;
            }
            if(a > days) m = z + 1;
            else n = z - 1;
        }
        return m;
    }
}

// @lc code=end

