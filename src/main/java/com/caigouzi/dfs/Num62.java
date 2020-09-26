package com.caigouzi.dfs;

/**
 * @author ：lihan
 * @description： 62. 不同路径
 * @date ：2020/9/8 14:43
 */
public class Num62 {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    f[i][j] = 1;
                } else {
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }

        return f[m - 1][n - 1];
    }


}
