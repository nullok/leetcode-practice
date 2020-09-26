package com.caigouzi.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/**
 * @author ：lihan
 * @description： 136. 只出现一次的数字
 * @date ：2020/8/13 16:17
 */
public class Num136 {
    public static void main(String[] args) {
        int[] res = new int[]{1, 2, 2};
        Num136 num136 = new Num136();
        System.out.println(num136.singleNumber(res));
    }
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int item :
                nums) {
            res ^= item;
        }
        return res;
    }

    public int hash(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 >= nums.length) {
                return nums[i];
            }
            if (nums[i] == nums[i+1]) {
                i++;
            } else {
                return nums[i];
            }
        }
        return 0;
    }
}
