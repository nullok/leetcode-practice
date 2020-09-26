package com.caigouzi.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 面试题 08.12. 八皇后
 * @date ：2020/8/15 15:13
 */
public class Num0812 {

    int MAX;
    int[] arr;
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        arr = new int[n];
        MAX = n;
        dfs(0);
        return res;
    }

    public void  dfs(int n ) {
        if (n == MAX) {
            addRes();
            return;
        }
        for (int i = 0; i < MAX; i++) {
            arr[n] = i;
            if (judge(n)) {
                dfs(n + 1);
            }
        }
    }

    /**
     * 放置位置是否符合
     * @param n
     * @return
     */
    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[n] == arr[i] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }
        }

        return true;
    }

    private void addRes() {
        List<String> t = new ArrayList<>();
        for (int i : arr) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < MAX; j++) {
                if (j == i) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            t.add(sb.toString());
        }
        res.add(t);
    }


}
