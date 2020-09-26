package com.caigouzi.other.bytedance;

import java.util.ArrayList;

/**
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * @author ：lihan
 * @description： 翻转字符串里的单词
 * @date ：2020/9/26 15:20
 */
public class ReverseWords {
    public String reverseWords(String s) {
        if (s == null || s.trim().length() == 0) return "";
        String[] arr = s.trim().split(" ");
        reverse(arr);
        StringBuilder sb = new StringBuilder();
        for (String ss : arr) {
            if (ss.length() > 0) {
                sb.append(ss);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public void reverse(String[] str) {
        int len = str.length;
        for (int i = 0; i < len / 2; i++) {
            String tmp = str[i];
            str[i] = str[len - i - 1];
            str[len - i - 1] = tmp;
        }
    }
}
