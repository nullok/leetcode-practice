package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 78. 子集
 * @date ：2020/9/20 8:43
 */
public class Num78 {
    public static void main(String[] args) {
        Num78 num78 = new Num78();

        num78.subsets(new int[]{1, 2, 3});
    }
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new LinkedList<>());
        return res;
    }

    public void dfs(int[] nums, int index, LinkedList<Integer> list) {
        if (list.size() <= nums.length) {
            res.add(new ArrayList<>(list));
        }
        for (int i = index; i < nums.length; i++) {
            list.addLast(nums[i]);
            dfs(nums, i + 1, list);
            list.removeLast();
        }
    }
}
