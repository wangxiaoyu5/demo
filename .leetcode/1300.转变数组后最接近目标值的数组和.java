/*
 * @lc app=leetcode.cn id=1300 lang=java
 *
 * [1300] 转变数组后最接近目标值的数组和
 */

// @lc code=start
class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            b[i] = b[i - 1] + arr[i - 1];
        }
        int r = arr[n - 1];
        int a = 0, t = target;
        for (int i = 1; i <= r; ++i) {
            int y = Arrays.binarySearch(arr, i);
            if (y < 0) {
                y = -y - 1;
            }
            int x = b[y] + (n - y) * i;
            if (Math.abs(x - target) < t) {
                a = i;
                t = Math.abs(x - target);
            }
        }
        return a;
    }
}


// @lc code=end

