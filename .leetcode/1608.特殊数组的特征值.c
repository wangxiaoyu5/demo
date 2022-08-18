/*
 * @lc app=leetcode.cn id=1608 lang=c
 *
 * [1608] 特殊数组的特征值
 */

// @lc code=start


int specialArray(int* nums, int numsSize){
    for(int i=0;i<=numsSize;i++){
        int m=0;
        for(int j=0;j<numsSize;j++){
            if(nums[j]>=i){
              m++;
            }
        }
        if(m==i){
            return i;
        }
    }
         return -1;
}



// @lc code=end

