class Solution {
    public int[] findSwapValues(int[] array1, int[] array2) {
        int m = 0, i = 0, j = 0;
        for (int arr : array1) {
            m += arr;
        }
        for (int arr : array2) {
            m -= arr;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        while (i < array1.length && j < array2.length) {
            if (m == (array1[i] - array2[j]) * 2) {
                return new int[]{ array1[i],array2[j]};
            } else if ((array1[i] - array2[j]) * 2 < m) {
                i++;
            } else {
                j++;
            }
        }
        return new int[]{};
    }
}
