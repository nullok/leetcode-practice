package com.caigouzi.array;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author ：lihan
 * @description： 414. 第三大的数
 * @date ：2020/8/20 11:11
 */
public class Num414 {
    public static void main(String[] args) {

        thirdMax(new int[]{2, 2, 3, 1});
    }
    public static int thirdMax(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int one = nums[0];
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int now = nums[0];
            if (now == one || now == two || now == three) {
                continue;
            }
            if (now > one) {
                three = two;
                two = one;
                one = now;
            }else if (now > two) {
                three = two;
                two = one;
            } else if (now > three) {
                three = now;
            }
        }
        if (three ==  Integer.MIN_VALUE) return one;
        return three;
    }
}
