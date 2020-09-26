package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 459. 重复的子字符串
 * @date ：2020/8/24 18:13
 */
public class Num459 {
    public static void main(String[] args) {
        repeatedSubstringPattern("aba");
    }
    public static boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}
