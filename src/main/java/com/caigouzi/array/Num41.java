package com.caigouzi.array;

/**
 * @author ：lihan
 * @description： 41. 缺失的第一个正数
 * @date ：2020/8/25 8:39
 */
public class Num41 {
    public static void main(String[] args) {
        firstMissingPositive(new int[]{3,4,-1,1});
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
            
        }

        return n + 1;
    }
}
