/*
 * @lc app=leetcode.cn id=1346 lang=c
 *
 * [1346] 检查整数及其两倍数是否存在
 */

// @lc code=start


bool checkIfExist(int* arr, int arrSize){
      for(int i = 0; i < arrSize; i++){
            for (int j = i + 1; j < arrSize; j++){
                if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
// @lc code=end

