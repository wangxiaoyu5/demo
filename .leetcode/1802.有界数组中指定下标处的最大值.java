/*
 * @lc app=leetcode.cn id=1802 lang=java
 *
 * [1802] 有界数组中指定下标处的最大值
 */

// @lc code=start
class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long l = 0, r = maxSum;
        maxSum -= n;
        while(l<r){
            long m = l+r+1>>1;
            long k = m*m;
            if(m>index)  k-= (m-index-1)*(m-index)/2;
            if(m>(n-index)) k -= (m-(n-index-1)-1)*(m-(n-index-1))/2; 
            if(k>maxSum) r = m-1;
            else l = m;
        }
        return (int)l+1;
    }
}

 
// @lc code=end

