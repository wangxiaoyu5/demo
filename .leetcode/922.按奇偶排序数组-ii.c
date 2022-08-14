/*
 * @lc app=leetcode.cn id=922 lang=c
 *
 * [922] 按奇偶排序数组 II
 */

// @lc code=start


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortArrayByParityII(int* nums, int numsSize, int* returnSize){
    int* ans = malloc(sizeof(int) * numsSize);
    int m = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] % 2 == 0) {
            ans[m] = nums[i];
            m += 2;
        }
    }
    m = 1;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] % 2 == 1) {
            ans[m] = nums[i];
            m += 2;
        }
    }
    *returnSize = numsSize;
    return ans;
}



// @lc code=end

