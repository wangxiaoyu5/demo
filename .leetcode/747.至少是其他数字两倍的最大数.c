/*
 * @lc app=leetcode.cn id=747 lang=c
 *
 * [747] 至少是其他数字两倍的最大数
 */

// @lc code=start


int dominantIndex(int* nums, int numsSize){
    int max = 0;
    int m = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] > max) {
            max = nums[i];
            m = i;
        }
    }

    for (int i = 0; i < numsSize; i++) {
        if (nums[i] != max) {
            if (max < (2 * nums[i])) {
                return -1;
            }
        }
    }
    return m;
}



// @lc code=end

