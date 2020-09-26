package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 58. 最后一个单词的长度
 * @date ：2020/8/28 14:36
 */
public class Num58 {
    public int lengthOfLastWord(String s) {
        if (s.trim().length()==0) return 0;
        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();
    }
}
