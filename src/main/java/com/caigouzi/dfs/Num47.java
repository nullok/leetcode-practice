package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 47. 全排列 II
 * @date ：2020/9/18 12:32
 */
public class Num47 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int[] map = new int[nums.length];
        Arrays.sort(nums);
        dfs(map, nums, new LinkedList<>());
        return res;
    }

    public void dfs(int[] map,int[] nums, LinkedList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (map[i] == 1 || (i>0 && nums[i] ==nums[i-1] && (map[i-1] !=0))) {
                continue;
            }
            list.addLast(nums[i]);
            map[i] = 1;
            dfs(map,nums, list);
            map[i] = 0;
            list.removeLast();
        }
    }
}
