/*
 * @lc app=leetcode.cn id=349 lang=c
 *
 * [349] 两个数组的交集
 */

// @lc code=start


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize){
    int n=0;
    int* ans=(int*)malloc(sizeof(int)*nums1Size);
  
    int m[1000]={0};
    for(int k=0;k<nums1Size;k++){
        m[nums1[k]]++;
    }
    
    int i,j,k=0;
    for(j=0;j<nums2Size;j++){
        for(i=0;i<nums1Size;i++){
            if(nums1[i]==nums2[j]&&m[nums1[i]]!=-1){
                n++;
                ans[k++]=nums1[i];
                m[nums1[i]]=-1;
            }
        }
    }
    *returnSize=n;
    return ans;
}


// @lc code=end

