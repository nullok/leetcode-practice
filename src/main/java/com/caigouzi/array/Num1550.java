package com.caigouzi.array;

/**
 * @author ：lihan
 * @description： 1550. 存在连续三个奇数的数组
 * @date ：2020/8/26 18:44
 */
public class Num1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i - 1] % 2 == 0 && arr[i - 2] % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
