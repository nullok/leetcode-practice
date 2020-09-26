package com.caigouzi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author ：lihan
 * @description： 26. 删除排序数组中的重复项
 * @date ：2020/8/12 15:37
 */
public class Num26 {
    public int removeDuplicates(int[] nums) {
        int arrIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[arrIndex] == nums[i]) {
                continue;
            }
            nums[++arrIndex] = nums[i];
        }
        return arrIndex + 1;
    }
}
