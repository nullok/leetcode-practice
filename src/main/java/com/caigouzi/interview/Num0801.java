package com.caigouzi.interview;

/**
 * @author ：lihan
 * @description： 面试题 08.01. 三步问题
 * @date ：2020/9/12 11:18
 */
public class Num0801 {
    public static void main(String[] args) {
        waysToStep(3);
    }
    public static int waysToStep(int n) {
        int mod = 1000000007;
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            f[i] = f[i - 1];
            if (i>=2) f[i] = (f[i] + f[i-2]) % mod;
            if(i >= 3) f[i] = (f[i] + f[i-3]) % mod;
        }
        return f[n];
    }
}
