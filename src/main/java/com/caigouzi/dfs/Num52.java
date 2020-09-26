package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 52. N皇后 II
 * @date ：2020/8/14 12:50
 */
public class Num52 {
    // arr = {2,3,5,6,8,...}
    int[] arr = null;
    int res = 0;
    int MAX = 0;

    public int totalNQueens(int n) {
        arr = new int[n];
        MAX = n;
        dfs(0);
        return res;
    }

    public void dfs(int n) {
        if (n == MAX) {
            res++;
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

}
