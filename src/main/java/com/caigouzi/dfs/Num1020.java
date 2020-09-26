package com.caigouzi.dfs;

/**
 * 还是从边界入手 ，深度遍历
 * 返回网格中无法在任意次数的移动中离开网格边界的陆地单元格的数量。
 * @author ：lihan
 * @description： 1020. 飞地的数量
 * @date ：2020/8/16 11:04
 */
public class Num1020 {
    int[][] arr;
    public int numEnclaves(int[][] A) {
        arr = A;
        int height = A.length;
        int width = A[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean f = i == 0 || j == 0 || i == height - 1 || j == width - 1;
                if (f && arr[i][j] == 1) {
                    dfs(i, j);
                }
            }
        }
        int count = 0;
        for (int[] a : A) {
            for (int t : a) {
                if (t == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j) {
        // arr[i][j] <= 0 --> -1 0
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0) {
            return;
        }
        arr[i][j] = 0;
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);

    }
}
