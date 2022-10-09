class Solution {
    public int mySqrt(int x) {
          if (x == 0) {
            return 0;
        }
        int m = 1, n = x;
        while (m < n) {
            int k = m + (n - m + 1) / 2;
            if ((long) k * k <= x) {
                m = k;
            } else {
                n = k - 1;
            }
        }
        return m;
    }
}