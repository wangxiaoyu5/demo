/*
 * @lc app=leetcode.cn id=1170 lang=java
 *
 * [1170] 比较字符串最小字母出现频次
 */

// @lc code=start
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] m = new int[queries.length];
        int[] n = new int[words.length];
        int x = 0;
        
        for(int i = 0;i < words.length;i++){
            char[] a = words[i].toCharArray();
            Arrays.sort(a);
            int t  = 1;
            for(int j = 0;j < a.length - 1;j++){
                if(a[j] == a[j + 1]){
                    t++;
                }else{
                    break;
                }
            }
            n[x++] = t;
        }
        int y = 0;
       
        for(int i = 0;i < queries.length;i++){
            char[] a = queries[i].toCharArray();
            Arrays.sort(a);
            int t  = 1;
            for(int j = 0;j < a.length - 1;j++){
                if(a[j] == a[j + 1]){
                    t++;
                }else{
                    break;
                }
            }
            int g = 0;
            for(int k = 0;k < n.length;k++){
                if(t < n[k]){
                    g++;
                }
            }
            m[y++] = g;
        }
        return m;
    }
}

   
// @lc code=end

