/*
 * @lc app=leetcode.cn id=1208 lang=java
 *
 * [1208] 尽可能使字符串相等
 */

// @lc code=start
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] nums = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            nums[i] = Math.abs(t.charAt(i) - s.charAt(i));
        }
        int c = 0, z = 0;
        int a = 0, b = 0;
        while(a <= b && b < s.length()){
            c += nums[b];
            
            while(a <= b &&c > maxCost){
                c-=nums[a++];
            }
            z = Math.max(z, b-a + 1);
            b++;
            
        }
        return z;
    }
}


// @lc code=end

