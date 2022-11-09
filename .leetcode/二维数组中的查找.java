class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int[] nums : matrix) {
            for (int num : nums) {
                if (num == target)
                 return true;
            }
        }
        return false;
    }
}