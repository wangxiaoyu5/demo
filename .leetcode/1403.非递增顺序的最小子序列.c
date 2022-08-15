/*
 * @lc app=leetcode.cn id=1403 lang=c
 *
 * [1403] 非递增顺序的最小子序列
 */

// @lc code=start


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* minSubsequence(int* nums, int numsSize, int* returnSize){
    int i = 0, a = 0,m = 0,v = 0, n, g = 0;
    int k[101] = {0};
    int *ans = (int*)malloc(sizeof(int) * 501);
    for(i = 0; i < numsSize; i ++){
        a += nums[i];
        k[nums[i]] ++;
    }
    i = 100;
    while(m <= (a - m)){
        if(g == 0){
            while(k[i] == 0){
                i --;
            }
            g = k[i];
            n = i;
            i--;
        }
        ans[v++] = n;
        m += n;
        g --;
    }
    *returnSize = v;
    return ans;
}
// @lc code=end

