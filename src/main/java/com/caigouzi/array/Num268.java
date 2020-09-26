package com.caigouzi.array;

/**
 * @author ：lihan
 * @description： 268. 缺失数字
 * @date ：2020/8/24 19:20
 */
public class Num268 {
    public int missingNumber(int[] nums) {
        boolean[] map = new boolean[nums.length + 1];
        for (int n : nums) {
            map[n] = true;
        }

        for (int i = 0; i < map.length; i++) {
            if (!map[i]) {
                return i;
            }
        }
        return 0;
    }
}
