package com.caigouzi.array;

/**
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * @author ：lihan
 * @description： 167. 两数之和 II - 输入有序数组
 * @date ：2020/8/30 10:51
 */
public class Num167 {
    public int[] twoSum1(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                int[] res = new int[2];
                res[0] = i+1;
                res[1] = j+1;
                return res;
            } else {
                j++;
            }

            if (j >= numbers.length) {
                i++;
                j = i + 1;
            }

        }
        return null;
    }
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                int[] res = new int[2];
                res[0] = i+1;
                res[1] = j+1;
                return res;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }
}
