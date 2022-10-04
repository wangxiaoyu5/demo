/*
 * @lc app=leetcode.cn id=1385 lang=java
 *
 * [1385] 两个数组间的距离值
 */

// @lc code=start
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = 0;
    	for(int a = 0; a < arr1.length; a++) {
    		int j = 0;
    		for(int i = 0; i < arr2.length; i++) {
    			if(Math.abs(arr1[a]-arr2[i]) > d) {
    				j++;
    				if(j==arr2.length) {
    				    m++;
    			    }
    			}
    		}
    	}
    	return m;
    }
}


// @lc code=end

