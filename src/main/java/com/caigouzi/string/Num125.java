package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 125. 验证回文串
 * @date ：2020/8/27 17:32
 */
public class Num125 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = c - '0';

            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (num >= 0 && num <= 9)) {
                sb.append(c);
            }
        }

        String newString = sb.toString().toLowerCase();
        for (int i = 0; i < newString.length() / 2; i++) {
            if (newString.charAt(i) == newString.charAt(newString.length() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
