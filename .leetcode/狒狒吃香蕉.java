class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int a = 0; int b = 0;
        for (int i = 0; i < n; i++) {
            b += piles[i];
            a = Math.max(a, piles[i]);
        }
        int t = (b % h == 0) ? (b / h) : (b / h + 1);
         
        int q = t; int p = a;
        while(q < p) {
            int m = q + (p - q) / 2;
           
            int y = 0;
            for (int i = 0; i < n; i++) {
                y += (piles[i] % m == 0) ? (piles[i] / m) : (piles[i] / m + 1);
            }
            if (y > h) { 
                q = m + 1;
            } else if (y <= h) { 
                p = m;        
            }
        }
        return q;
    }
}
