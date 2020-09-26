package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 14. 最长公共前缀
 * @date ：2020/8/27 17:40
 */
public class Num14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = longestCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }

        return prefix;

    }

    public String longestCommonPrefix(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < len && (str1.charAt(index) == str2.charAt(index))) {
            index++;
        }
        return str1.substring(0, index);
    }
}
