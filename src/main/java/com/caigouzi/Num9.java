package com.caigouzi;

/**
 * @author ：lihan
 * @description： 回文数
 * @date ：2020/8/7 19:21
 */
public class Num9 {
    public static void main(String[] args) {
        Num9 num9 = new Num9();
        System.out.println(num9.isPalindrome(10));

    }
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return isPalindrome(str);
    }

    public boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char c = str.charAt(i);
            char c1 = str.charAt(str.length() - 1 - i);
            if (c != c1) return false;
        }
        return true;
    }
}
