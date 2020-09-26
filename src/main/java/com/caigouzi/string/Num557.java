package com.caigouzi.string;

import java.util.Arrays;

/**
 * @author ：lihan
 * @description： 557. 反转字符串中的单词 III
 * @date ：2020/8/30 10:09
 */
public class Num557 {
    public static void main(String[] args) {
        System.out.println("Let's t".substring(0, 5));
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split(" ");
//        for (String ss : s1) {
//            sb.append(reverse(ss.toCharArray()));
//            sb.append(" ");
//        }
        for (int i = 0; i < s1.length; i++) {
            sb.append(reverse(s1[i].toCharArray()));
            if (i + 1 < s1.length) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public char[] reverse(char[] arr) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = tmp;
        }
        return arr;
    }
}
