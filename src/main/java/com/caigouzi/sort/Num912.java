package com.caigouzi.sort;

/**
 * 给你一个整数数组 nums，请你将该数组升序排列。
 * @author ：lihan
 * @description： 912. 排序数组
 * @date ：2020/9/21 9:33
 */
public class Num912 {
    public int[] sortArray(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[i - 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                }
            }
        }

        return nums;
    }
}
