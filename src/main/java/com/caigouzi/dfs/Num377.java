package com.caigouzi.dfs;

import java.util.LinkedList;

/**
 * @author ：lihan
 * @description： 377. 组合总和 Ⅳ
 * @date ：2020/9/9 11:01
 */
public class Num377 {
    int count;
    int[] NUMS;
    public int combinationSum4(int[] nums, int target) {
        NUMS = nums;
        dfs(target);
        return count;
    }

    public void dfs( int target) {
        if (target<0) return;
        if (target == 0) {
            count++;
            return;
        }
        for (int i = 0; i < NUMS.length; i++) {
            dfs(target - NUMS[i]);
        }
    }
}
