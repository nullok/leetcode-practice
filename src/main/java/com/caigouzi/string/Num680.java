package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 680. 验证回文字符串 Ⅱ
 * @date ：2020/9/1 9:52
 */
public class Num680 {
    public static void main(String[] args) {
        System.out.println("12345".substring(1, 3));
    }
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return check(s, i + 1, j) || check(s, i, j - 1);
            }
        }

        return true;
    }

    public boolean check(String s,int i,int j ) {
        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}
