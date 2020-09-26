package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 90. 子集 II
 * @date ：2020/9/20 9:08
 */
public class Num90 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        boolean[] map = new boolean[nums.length];
        dfs(nums, map,0, new LinkedList<>());
        return res;
    }

    public void dfs(int[] nums,boolean[] map, int index, LinkedList<Integer> list) {
        res.add(new ArrayList<>(list));

        for (int i = index; i < nums.length; i++) {
            if (i > 0 && (nums[i] == nums[i - 1]) && !map[i-1]) {
                continue;
            }
            list.addLast(nums[i]);
            map[i] = true;
            dfs(nums, map,i + 1, list);
            map[i] = false;
            list.removeLast();
        }
    }

}
