package com.caigouzi.dp;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/13 15:39
 */
public class Num70 {
    public int climbStairs(int n) {
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2] + 1;
        }
        return f[n];
    }
}
