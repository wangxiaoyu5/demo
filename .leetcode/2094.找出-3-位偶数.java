import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2094 lang=java
 *
 * [2094] 找出 3 位偶数
 */

// @lc code=start
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> m = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && i!=k && j!=k && digits[i]!=0){
                        int num = digits[i]*100+digits[j]*10+digits[k];
                        if(num%2 == 0){
                            m.add(num);
                        }
                    }
                }
            }
        }
        int[] g = new int[m.size()];
        int h = 0;
        for(int i:m){
            g[h++] = i;
        }
        Arrays.sort(g);
        return g;
    }
}



// @lc code=end

