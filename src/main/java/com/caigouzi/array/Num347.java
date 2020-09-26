package com.caigouzi.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 *
 * @author ：lihan
 * @description： 347. 前 K 个高频元素
 * @date ：2020/9/7 10:05
 */
public class Num347 {
    public static void main(String[] args) {
        Num347 num347 = new Num347();
        num347.topKFrequent(new int[]{1, 2}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        ArrayList<Integer> arrayValue = new ArrayList<>(map.values());
        Collections.sort(arrayValue);
        int[] res = new int[k];
        for (int i = arrayValue.size() - 1, count = k; i >= 0 && count > 0; i--, count--) {
            res[count - 1] = arrayValue.get(i);
        }
        int[] r = new int[k];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (res[i] != -1 && entry.getValue().equals(res[i])) {
                    r[index++] = entry.getKey();
                    entry.setValue(-1);
                    res[i] = -1;
                }
            }
        }


        return r;
    }
}
