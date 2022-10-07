class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int m = 0;
        int n = nums.length - 1;
        while(true) {
            int k = nums[m] + nums[n];
            if(k > target) {
                n--;
            } else if(k < target) {
                m++;
            } else {
                a[0] = nums[m];
                a[1] = nums[n];
                break;
            }
        }
        return a;
    }
}