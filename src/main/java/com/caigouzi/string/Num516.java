package com.caigouzi.string;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/19 12:03
 */
public class Num516 {
    int len = 0;
    public int longestPalindromeSubseq(String s) {
        for (int i = 0; i < s.length(); i++) {
            count(s, i, i);
            count(s, i, i + 1);

        }
        return len;
    }

    public void count(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            int newLen = end - start;
            if (newLen > len) {
                len = newLen;
            }
            start--;
            end++;
        }
    }
}
