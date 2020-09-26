package com.caigouzi.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * [1,4], 2
 * 1    2
 *              4   5
 * [1,2], 2
 * 1    2
 *      2   3
 *
 * [1,2,3] 5
 * 1    2   3   4   5
 *      2   3   4   5   6
 *          3   4   5   6   7
 * @author ：lihan
 * @description：
 * @date ：2020/8/20 10:50
 */
public class Num495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int len = timeSeries.length;
        if (len == 0) {
            return 0;
        }

        int total = 0;
        for(int i = 0; i < len - 1; ++i)
            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        //补上最后的
        return total + duration;
    }
}
