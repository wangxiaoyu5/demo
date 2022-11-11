class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums[0] >= target) 
        return 1;
        int a = 0;
        int b = nums[0];
        int n = 1;
        int m = nums.length;
        for (int i = 1; i < nums.length; i++) {
            b += nums[i];
            n++;
            while (b >= target){
                    if((b - nums[a]) >= target){
                        b -= nums[a];
                        a++;
                        n--;
                    }else {
                        if(n < m) m = n;
                        break;
                    }
            }
        }
        if (b < target)
         return 0;
        return m;
    }
}