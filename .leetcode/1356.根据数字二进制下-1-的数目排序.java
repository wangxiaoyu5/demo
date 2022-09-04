/*
 * @lc app=leetcode.cn id=1356 lang=java
 *
 * [1356] 根据数字二进制下 1 的数目排序
 */

// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        
        int[] m = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            m[i]=arr[i];
            int n = 0;
            for(int k=1;k<=32;k++){
                n+=m[i]&1;
                m[i]>>=1; 
            }
            m[i]=n;
        }

       for (int i = 0; i < m.length - 1; i++) {
        for (int j = 0; j < m.length - 1 - i; j++) {
            if (m[j] > m[j+1]) {       
                int g = m[j+1];       
                m[j+1] = m[j];
                m[j] = g;

                g = arr[j+1];        
                arr[j+1] = arr[j];
                arr[j] = g;
            }
            if (m[j] == m[j+1]&&arr[j] > arr[j+1]){
                int x = arr[j+1];       
                arr[j+1] = arr[j];
                arr[j] = x;
            }
        }
    }
        
        return arr;

    }
}

  
// @lc code=end

