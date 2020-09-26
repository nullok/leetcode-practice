package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 3. 无重复字符的最长子串
 * @date ：2020/8/10 20:02
 */
public class Num3 {
    public static void main(String[] args) {
        Num3 num3 = new Num3();
        System.out.println(num3.lengthOfLongestSubstring("pwwkew"));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int pre = 0;
        int cur = 0;
        int preCount = 0;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            // 取当前字符串之前的字符串
            String preString = s.substring(pre, i);
            // 判断当前字符是否存在于之前的字符串里
            int index = hasContain(c, preString);
            if (index != -1) {
                // 若存在，将从pre到当前字符的字符串的长度取最大值  存一下
                preCount = Math.max(preString.length(), preCount);
                // 将pre 指针后移
                // pre指的是s字符串的位置所以要加上pre，
                pre = index+pre;
                pre++;
            }
            // 主要是记录最后一次的位置
            cur = i;
        }
        // 将双指针的长度 与之前的preCount 比较 取最大值
        preCount = Math.max(preCount, cur - pre + 1);
        return preCount;
    }

    public int hasContain(char c, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}
