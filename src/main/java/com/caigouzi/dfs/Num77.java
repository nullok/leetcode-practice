package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入: n = 4, k = 2
 * 输出:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * @author ：lihan
 * @description： 77. 组合
 * @date ：2020/9/8 14:05
 */
public class Num77 {
    public static void main(String[] args) {
        Num77 num77 = new Num77();
        num77.combine(4, 3);
    }
    int N;
    int K;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        N = n;
        K = k;
        dfs(1, new LinkedList<>());
        return res;
    }

    public void dfs(int index, LinkedList<Integer> list) {
        if (list.size() == K) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < N; i++) {
            list.addLast(i);
            dfs(i + 1, list);
            list.removeLast();
        }
    }
}
