class Solution {
    public int findMagicIndex(int[] nums) {
        int m = nums.length;
        for (int i = 0; i < m; i++) {
            if (i == nums[i])
                return i;
        }
        return -1;
    }
}
