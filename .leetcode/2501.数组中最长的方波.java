/*
 * @lc app=leetcode.cn id=2501 lang=java
 *
 * [2501] 数组中最长的方波
 */

// @lc code=start
class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,m=nums[n-1],t=-1;
        int[] w=new int[m+1];
        for(int i=0;i<n;i++){
            w[nums[i]]=1;
        }
        for(int i=0;i<n;i++){
            int x=(int)Math.sqrt(nums[i]);
            if(x*x!=nums[i])
            continue;
            w[nums[i]]=w[x]+1;
        }
        for(int i=0;i<=m;i++){
            if(w[i]>=2)
            t=Math.max(t,w[i]);
        }
        return t;

    }
}
// @lc code=end

