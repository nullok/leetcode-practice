package com.caigouzi.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/23 15:08
 */
public class Num448 {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        int i = 0;
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) {
                res.add(j+1);
            }
        }
        return res;
    }
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        boolean[] map = new boolean[nums.length + 1];
        for (int n : nums) {
            map[n] = true;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < map.length; i++) {
            if (!map[i]) res.add(i);
        }
        return res;
    }
}
