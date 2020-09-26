package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 647. 回文子串
 * @date ：2020/8/19 10:37
 */
public class Num647 {
    int count;

    public static void main(String[] args) {
        System.out.println(isHui("aba"));
    }
    public  int countSubstrings(String s) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String item = s.substring(i, j);
                if (isHui(item)) {
                    count++;
                    if (item.equals(s)) {
                        flag = true;
                    }
                }
            }
        }

        return count;
    }

    public static boolean isHui(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

}
