/*
 * @lc app=leetcode.cn id=475 lang=java
 *
 * [475] 供暖器
 */

// @lc code=start
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int a = 0;
        for (int i = 0, j = 0; i < houses.length; i++) {
            int x = Math.abs(houses[i] - heaters[j]);
            while (j < heaters.length - 1 && Math.abs(houses[i] - heaters[j]) >= Math.abs(houses[i] - heaters[j + 1])) {
                j++;
                x = Math.min(x, Math.abs(houses[i] - heaters[j]));
            }
            a = Math.max(a, x);
        }
        return a;
    }
}

    
// @lc code=end

