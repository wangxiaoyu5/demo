/*
 * @lc app=leetcode.cn id=1539 lang=java
 *
 * [1539] 第 k 个缺失的正整数
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int[] ans = new int[2010];
        for( i = 1;i <= 2000; i++) ans[i] = i; 
        for( i = 0;i < arr.length;i++){
            ans[arr[i]] = -1;
        }
        for(i = 1;i <= 2000; i++){
            if(ans[i]==-1){
                continue;   
            }else{
                k--;
                if(k==0)break;
            }
        }
        return ans[i];
    }
}


// @lc code=end

