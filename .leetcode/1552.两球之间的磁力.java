import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1552 lang=java
 *
 * [1552] 两球之间的磁力
 */

// @lc code=start
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l = 1;
        int r = (position[n-1] - position[0]) / (m - 1);
        while(l < r){
            int a = l + (r - l + 1) / 2;
            int b = 1;
            int c = position[0];
            for(int i = 1; i < n; i++){
                if(position[i] - c >= a){
                    c = position[i];
                    b++;
                }
            }
            if(b >= m){
                
                l = a;
            }else{
                r = a - 1;
            }
        }
        return l;
    }
}

// @lc code=end

