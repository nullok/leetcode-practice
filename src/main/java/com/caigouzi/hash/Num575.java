package com.caigouzi.hash;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author ：lihan
 * @description： 575. 分糖果
 * @date ：2020/9/11 10:33
 */
public class Num575 {
    public static void main(String[] args) {
        Num575 num575 = new Num575();
        num575.distributeCandies(new int[]{1,1,2,3});
    }
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : candies) {
            set.add(i);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
