package com.caigouzi.string;

import javax.swing.*;

/**
 * 1 2 3 4 5 6 7 8 9 10  11  12
 * @author ：lihan
 * @description： 541. 反转字符串 II
 * @date ：2020/8/29 14:27
 */
public class Num541 {
    public static void main(String[] args) {
        reverseStr("abcd", 3);
    }
    public static String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);

    }

}
