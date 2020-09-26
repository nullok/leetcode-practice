package com.caigouzi.array;

/**

 * @author ：lihan
 * @description： 485. 最大连续1的个数
 * @date ：2020/8/20 10:26
 */
public class Num485 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1};
    }
    public  int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;

    }
}
