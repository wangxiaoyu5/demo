import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=2389 lang=java
 *
 * [2389] 和有限的最长子序列
 */

// @lc code=start
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] m=new int[queries.length];
        Arrays.sort(nums);
        int h=0;
        int n=0;
        for(int i=0;i<queries.length;i++){
            n=0;
            h=0;
            for(int j=0;j<nums.length;j++){
                h+=nums[j];
                if(h<=queries[i]){
                    n++;
                }else{
                    break;
                }

            }
            m[i]=n;

        }

        return m;

    }
}

 
// @lc code=end

