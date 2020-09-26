package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 696. 计数二进制子串
 * @date ：2020/8/10 19:31
 */
public class Num696 {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
    public static int countBinarySubstrings(String s) {
        int curr = 1;
        int last = 0;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                last = curr;
                curr = 1;
            }

            if (last >= curr) count++;
        }
        return count;
    }
}
