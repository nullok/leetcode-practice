package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 216. 组合总和 III
 * @date ：2020/9/9 10:45
 */
public class Num216 {
    int K;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        K = k;
        dfs(1, n, new LinkedList<>());
        return res;
    }

    public void dfs(int index, int target, LinkedList<Integer> list) {
        if (target < 0 || list.size() > 3) {
            return;
        }
        if (target == 0 && list.size() == 3) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i <= 9; i++) {
            list.addLast(i);
            dfs(i, target - i, list);
            list.removeLast();
        }
    }
}
