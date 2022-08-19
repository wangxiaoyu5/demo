/*
 * @lc app=leetcode.cn id=888 lang=c
 *
 * [888] 公平的糖果交换
 */

// @lc code=start


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* fairCandySwap(int* aliceSizes, int aliceSizesSize, int* bobSizes, int bobSizesSize, int* returnSize){
    long m[100001] = {0};
    int h = 0;
    int* ans = malloc(sizeof(int) * 2);
    *returnSize = 2;
    for(int i = 0; i < aliceSizesSize; i++){
        m[aliceSizes[i]] = 1;
        h += aliceSizes[i];
    }
    for(int i = 0; i < bobSizesSize; i++){
        h -= bobSizes[i];
    } 
    for(int i = 0; i < bobSizesSize; i++){
        int t = h/2 + bobSizes[i];
        if(t > 0 && t < 100001 && m[t]){
            ans[0] = h/2 + bobSizes[i];
            ans[1] = bobSizes[i];
            return ans;
        }
    } 
    return ans;
}


// @lc code=end

