package com.caigouzi.array;

/**
 * @author ：lihan
 * @description： 287. 寻找重复数
 * @date ：2020/8/24 19:26
 */
public class Num287 {
    public int findDuplicate(int[] nums) {
        int[] map = new int[nums.length];
        for (int n : nums) {
            map[n]++;
        }
        for (int i = 1; i < map.length; i++) {
            if (map[i] > 1) {
                return i;
            }

        }
        return 0;
    }
}
