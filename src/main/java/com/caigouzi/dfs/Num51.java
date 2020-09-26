package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：lihan
 * @description：  51. N皇后
 * @date ：2020/8/14 12:50
 */
public class Num51 {
    // arr = {2,3,5,6,8,...}
    int[] arr = null;
    List<List<String>> res = new ArrayList<>();
    int MAX = 0;
    public static void main(String[] args) {
        Num51 num51 = new Num51();
        System.out.println(num51.solveNQueens(10).size());
    }
    public List<List<String>> solveNQueens(int n) {
        arr = new int[n];
        MAX = n;
        dfs(0);
        return res;
    }

    public void dfs(int n) {
        if (n == MAX) {
            toChangeArray();
            return;
        }

        for (int i = 0; i < MAX; i++) {
            arr[n] = i;
            if (check(n)) {
                dfs(n + 1);
            }
        }
    }

    /**
     * 将要放的位置
     * @param n
     * @return
     */
    public boolean check(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(i - n) == Math.abs(arr[i] - arr[n])) {
                return false;
            }
        }
        return true;
    }

    private void toChangeArray() {
        List<String> l = new ArrayList<>(MAX);
        for (int i : arr) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < MAX; j++) {
                if (i == j) {
                    sb.append('Q');
                } else {
                    sb.append('.');
                }
            }
            l.add(sb.toString());
        }
        res.add(l);
    }
}
