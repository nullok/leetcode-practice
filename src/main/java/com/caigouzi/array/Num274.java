package com.caigouzi.array;

import java.util.Arrays;

/**
 * @author ：lihan
 * @description：274. H 指数
 * @date ：2020/8/25 14:33
 */
public class Num274 {
    public static void main(String[] args) {
        hIndex(new int[]{1, 2});
    }
    public static int hIndex(int[] citations) {
        if (citations.length == 1) {
            return citations[0] > 0 ? 1 : 0;
        }
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= (citations.length - i)) {
                return citations[i];
            }
        }
        return 0;
    }
}
