package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * @author ：lihan
 * @description： 39. 组合总和
 * @date ：2020/9/9 10:27
 */
public class Num39 {
    int[] CAN;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        CAN = candidates;
        dfs(0,target, new LinkedList<>());
        return res;
    }

    public void dfs(int index,int target, LinkedList<Integer> list) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < CAN.length; i++) {
            int item = CAN[i];
            list.addLast(item);
            dfs(i,target - item,list);
            list.removeLast();
        }
    }
}
