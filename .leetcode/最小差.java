class Solution {
    public int smallestDifference(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        if (m == 1 && n == 1) {
            return Math.abs(a[0] - b[0]);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        long z =  Long.MAX_VALUE;
        while (i < m && j < n) {
            if (a[i] == b[j]) {
                return 0;
            }
            long h = a[i] - b[j];
            z = Math.min(Math.abs(h), z);
            if (h > 0) {
                j++;
            } else {
                i++;
            }
        }
        return (int) z;
    }
}