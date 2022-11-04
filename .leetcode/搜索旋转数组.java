class Solution {
    public int search(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }
        int m = 0;
        int n = arr.length - 1;
        while (m <= n) {
            int z = (m + n) >>> 1;
            if (arr[z] == target) {
                while (z > 1 && arr[z - 1] == arr[z]) {
                    z--;
                }
                return z;
            } else if (arr[z] > arr[m]) {
                if (arr[m] <= target && target < arr[z]) {
                    n = z - 1;
                } else {
                    m = z + 1;
                }
            } else if (arr[z] < arr[m]) {
                if (arr[z] < target && target <= arr[n]) {
                    m = z + 1;
                } else {
                    n = z - 1;
                }
            } else {
                m++;
            }
        }
        return -1;
    }
}
