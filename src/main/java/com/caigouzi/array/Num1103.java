package com.caigouzi.array;

/**
 * @author ：lihan
 * @description： 1103. 分糖果 II
 * @date ：2020/9/11 10:56
 */
public class Num1103 {
    public static void main(String[] args) {
        distributeCandies(10, 3);
    }
    public static int[] distributeCandies(int candies, int num_people) {
        int curr_give = 0;
        int[] res = new int[num_people];
        while (candies > 0) {
            res[curr_give % num_people] += Math.min(++curr_give, candies);
            candies -= curr_give;
        }
        return res;
    }
}
