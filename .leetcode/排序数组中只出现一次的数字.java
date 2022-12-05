class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a = 0, b = nums.length - 1;
        while (a < b) {
            int m = (b - a) / 2 + a;
            if (nums[m] == nums[m ^ 1]) {
                a = m + 1;
            } else {
                b = m;
            }
        }
        return nums[a];
    }
}
