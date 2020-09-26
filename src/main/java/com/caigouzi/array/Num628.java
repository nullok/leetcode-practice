package com.caigouzi.array;

import java.util.Arrays;

/**
 * @author ：lihan
 * @description： 628. 三个数的最大乘积
 * @date ：2020/8/23 14:12
 */
public class Num628 {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int pre = nums[0] * nums[1] * nums[2];
        int last = nums[len - 1] * nums[len - 2] * nums[len - 3];
        return Math.max(pre, last);
    }

    public int maximumProduct1(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2){
                min2 = n;
            }

            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }

}
