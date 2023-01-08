class Solution {
    public int minTime(int[] time, int m) {
        int a = 0, b = 0;
        for (int t : time) {
            b += t;
        }
        while (a < b) {
            int x = a + ((b - a) >> 1);
            int g = 1, y = 0, z = 0;
            for (int t : time) {
                y += t;
                z = Math.max(z, t);
                if (y - z > x) {
                    g++;
                    y = t;
                    z = t;
                }
            }
            if (g > m) {
                a = x + 1;
            } else {
                b = x;
            }
        }
        return a;
    }
}