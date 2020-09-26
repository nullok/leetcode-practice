package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 60. 第k个排列
 * @date ：2020/9/5 19:02
 */
public class Num60 {
    int N;
    int count = 0;
    int K;
    String res;
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; ++i) {
            factorial[i] = factorial[i - 1] * i;
        }

        --k;
        StringBuffer ans = new StringBuffer();
        int[] valid = new int[n + 1];
        Arrays.fill(valid, 1);
        for (int i = 1; i <= n; ++i) {
            int order = k / factorial[n - i] + 1;
            for (int j = 1; j <= n; ++j) {
                order -= valid[j];
                if (order == 0) {
                    ans.append(j);
                    valid[j] = 0;
                    break;
                }
            }
            k %= factorial[n - i];
        }
        return ans.toString();
    }

    public String getPermutation1(int n, int k) {
        N = n;
        K = k;
        int recurrence = recurrence(k);

        dfs(0,0, new StringBuilder());
        return res;
    }
    public static int recurrence(int num){
        if(num<=1)
            return 1;
        else
            return num*recurrence(num-1);
    }
    public void dfs(int index, int none,LinkedList<Integer> list) {
        if (list.size() == N) {
            if ((++count) == K) {
                StringBuilder sb = new StringBuilder();
                sb.deleteCharAt(sb.length() - 1);
                for (Integer n : list) {
                    sb.append(String.valueOf(n));
                }
                res = sb.toString();
            }
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (list.contains(i)) {
                continue;
            }

            list.add(i);
            dfs(i + 1, i,list);
            list.removeLast();
        }
    }

    public void dfs(int index, int none,StringBuilder sb) {
        if (sb.length() == N) {
            if ((++count) == K) {
                res = sb.toString();
            }
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (sb.indexOf(String.valueOf(i)) != -1) {
                continue;
            }

            sb.append(i);
            dfs(i + 1, i,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
