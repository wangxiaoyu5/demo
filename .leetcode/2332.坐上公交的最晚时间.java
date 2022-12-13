/*
 * @lc app=leetcode.cn id=2332 lang=java
 *
 * [2332] 坐上公交的最晚时间
 */

// @lc code=start
class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int j = 0, c = 0;
        for (var t : buses)
            for (c = capacity; c > 0 && j < passengers.length && passengers[j] <= t; --c)
                ++j;
        --j;
        var ans = c > 0 ? buses[buses.length - 1] : passengers[j]; 
        while (j >= 0 && passengers[j--] == ans)
         --ans; 
        return ans;
    }
}


 
// @lc code=end

