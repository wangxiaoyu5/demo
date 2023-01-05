/*
 * @lc app=leetcode.cn id=1818 lang=java
 *
 * [1818] 绝对差值和
 */

// @lc code=start
class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n=nums1.length,m=0;  
        long x=0;  
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            int y=Math.abs(nums1[i]-nums2[i]);   
            x+=y;    
            Integer t1=set.ceiling(nums2[i]);
            Integer t2=set.floor(nums2[i]);
            if(t1!=null){
                if(m<y-(t1-nums2[i]))
                m=y-(t1-nums2[i]);
            }
            if(t2!=null){
                if(m<y-(nums2[i]-t2))
                m=y-(nums2[i]-t2);
            }
        }
        return (int)((x-m)%1000000007); 
    }
}

// @lc code=end

