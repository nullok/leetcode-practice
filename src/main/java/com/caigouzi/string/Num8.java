package com.caigouzi.string;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author ：lihan
 * @description： 8. 字符串转换整数 (atoi)
 * @date ：2020/8/22 19:41
 */
public class Num8 {
    public static void main(String[] args) {
        System.out.println(Long.valueOf("+12312312312313"));

    }
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        str.trim();
        char[] chars = str.toCharArray();

        char symbol = '+';
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (char c : chars) {
            int num = c - '0';
            if (num >= 0 && num <= 9) {
                sb.append(c);
            } else if (c == '-' || c == '+') {
                symbol = c;
            } else if (sb.length() == 0) {
                return 0;
            } else if (c == '.') {
                break;
            }
        }
        sb.insert(0, symbol);
        if (sb.length() > 1) {
            long cur = Long.parseLong(sb.toString());
            if (cur > (long) Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (cur < (long) Integer.MIN_VALUE) return Integer.MIN_VALUE;
            return Integer.parseInt(sb.toString());
        } else {
            return 0;
        }
    }
}
