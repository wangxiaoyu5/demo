import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1237 lang=java
 *
 * [1237] 找出给定方程的正整数解
 */

// @lc code=start
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
       
            int x=1, y = 1000;
            List<List<Integer>> ret = new LinkedList<>();
            while (x<=1000&&y>=1) {
                int m = customfunction.f(x, y);
                if (m>z) {
                    y--;
                } else if (m<z) {
                    x++;
                } else {
                    ret.add(Arrays.asList(new Integer[]{x, y}));
                    y--;
                }
            }
            return ret;
        
    }
}
// @lc code=end

