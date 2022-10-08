class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int n = numbers.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(numbers[i] + numbers[j] == target){
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }

        return a;
    }
}
