package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 434. 字符串中的单词数
 * @date ：2020/8/28 14:24
 */
public class Num434 {
    public static void main(String[] args) {
        countSegments(", , , ,        a, eaefa");
    }
    public static int countSegments(String s) {

        if (s.length() == 0) return 0;
        String[] s1 = s.split(" ");
        int index = 0;
        for (String ss : s1) {
            if (!ss.equals("")) {
                index++;
            }
        }
        return index;
    }
}
