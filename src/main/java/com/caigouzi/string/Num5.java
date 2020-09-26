package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 5. 最长回文子串
 * @date ：2020/8/19 11:49
 */
public class Num5 {
    public static void main(String[] args) {
        Num5 num5 = new Num5();
        System.out.println(num5.longestPalindrome("ccc"));

    }

    int len = 0;
    int sIndex = 0;
    int eIndex = 0;
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        for (int i = 0; i < s.length(); i++) {
            count(s, i, i);// 奇数个
            count(s, i, i + 1);// 偶数个
        }
        return s.substring(sIndex, eIndex + 1);

    }

    public void count(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            if ((end - start) > len) {
                sIndex = start;
                eIndex = end;
                len = end - start;
            }
            start--;
            end++;
        }
    }

}
