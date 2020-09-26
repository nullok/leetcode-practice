package com.caigouzi;

/**
 * @author ：lihan
 * @description： 201. 数字范围按位与
 * @date ：2020/8/23 9:30
 */
public class Num201 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    public int rangeBitwiseAnd(int m, int n) {
        int offset = 0;

        while (m != 0 && n != 0) {
            if (m == n) return m << offset;
            m >>= 1;
            n >>= 1;
            offset++;
        }
        return 0;
    }
}
