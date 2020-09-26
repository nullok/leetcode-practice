package com.caigouzi.array;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/2 17:23
 */
public class Num977 {
    public static void main(String[] args) {
    }
    public  int[] sortedSquares(int[] A) {

        int[] res = new int[A.length];
        int index = A.length - 1;
        int i = 0, j = A.length - 1;
        while (i <= j) {
            int l = (A[i]) * (A[i]);
            int r = (A[j])*(A[j]);
            if (l < r) {
                res[index--] = r;
                j--;
            } else {
                res[index--] = l;
                i++;
            }
        }
        return res;
    }
}
