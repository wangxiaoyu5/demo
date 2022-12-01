/*
 * @lc app=leetcode.cn id=1898 lang=java
 *
 * [1898] 可移除字符的最大数目
 */

// @lc code=start
class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int a = 0,b = removable.length-1;
        while (a<=b){
            int m = (a+b)/2;
            StringBuilder c = new StringBuilder(s);
            for (int i=0;i<=m;i++)
                c.setCharAt(removable[i],' ');
            int j=0,i=0;
            String t = c.toString();
            while (i<p.length()&&j<t.length()){
                if (p.charAt(i)==t.charAt(j)){
                    i++;
                }
                j++;
            }
            

            if (i==p.length()){
                a = m+1;
            }else {
                b = m-1;
            }
        }
        return a;
    }
}

   
// @lc code=end

