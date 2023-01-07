/*
 * @lc app=leetcode.cn id=532 lang=java
 *
 * [532] 数组中的 k-diff 数对
 */

// @lc code=start
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i ++){ 
            int pre = nums[i] - k;
            if(set.contains(pre)){
                m.put(nums[i],pre);
            }
            set.add(nums[i]);
        }
        return m.keySet().size();
    }
}

  
// @lc code=end

