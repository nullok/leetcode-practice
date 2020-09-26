package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 * @author ：lihan
 * @description： 46. 全排列
 * @date ：2020/9/8 14:17
 */
public class Num46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if ( nums == null) return res;
        int[] map = new int[nums.length];
        dfs(map,nums, new LinkedList<>());
        return res;
    }

    public void dfs(int[] map,int[] nums, LinkedList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (map[i] == 1) {
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
