import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2300 lang=java
 *
 * [2300] 咒语和药水的成功对数
 */

// @lc code=start
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, m = potions.length;
        Arrays.sort(potions);
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i){
            int l = 0, r = m - 1;
            while (l <= r){
                int mid = (l + r) / 2;
                if ((long)spells[i] * potions[mid] < success){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
            ans[i] = m - r - 1;
        }
        return ans;
    }

}
// @lc code=end

