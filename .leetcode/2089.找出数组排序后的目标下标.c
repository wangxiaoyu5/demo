/*
 * @lc app=leetcode.cn id=2089 lang=c
 *
 * [2089] 找出数组排序后的目标下标
 */

// @lc code=start


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* targetIndices(int* nums, int numsSize, int target, int* returnSize){
    int n=0;
    int i=0;
    int ansSize=0;
    
    for(i=0;i<numsSize;i++){
        if(nums[i]<target){
            n++;
        }else if(nums[i]==target){
            ansSize++;
        } 
    }
    
    int* ans=(int*)malloc(sizeof(int)*ansSize);
    for(i=0;i<ansSize;i++){
        ans[i]=n;
        n++;
    }
    *returnSize=ansSize;
    return ans;
}



// @lc code=end

