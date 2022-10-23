import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=658 lang=java
 *
 * [658] 找到 K 个最接近的元素
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int h = 0, g = n - 1;
        int m = n - k;
        while (m > 0) {
            if (x - arr[h] <= arr[g] - x) {
                g--;
            } else {
                h++;
            }
            m--;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = h; i < h + k; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }
}


// @lc code=end

