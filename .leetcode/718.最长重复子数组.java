/*
 * @lc app=leetcode.cn id=718 lang=java
 *
 * [718] 最长重复子数组
 */

// @lc code=start
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int g=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    int h=i;
                    int t=j;
                    int a=0;
                    while(h<m && t<n){
                        if(nums1[h]==nums2[t]){
                            a++;
                            h++;
                            t++;
                        }else{
                            break;
                        }
                    }
                    g=Math.max(g,a);
                }
            }
        }
        return g;
    }

}

    
// @lc code=end

