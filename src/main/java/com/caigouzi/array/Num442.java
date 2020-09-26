package com.caigouzi.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 442. 数组中重复的数据
 * @date ：2020/8/24 18:43
 */
public class Num442 {
    public List<Integer> findDuplicates1(int[] nums) {
        int[] map = new int[nums.length + 1];
        for (int n : nums) {
            map[n]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 2) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }
    public static List<Integer> findDuplicates(int[] nums) {
        // nums[i]对应的值 代表nums 的下标，然后将其变成相反数
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                res.add(Math.abs(nums[i]));
                continue;
            }
            nums[Math.abs(nums[i]) - 1] = nums[Math.abs(nums[i]) - 1] * -1;
        }
        return res;
    }
}
