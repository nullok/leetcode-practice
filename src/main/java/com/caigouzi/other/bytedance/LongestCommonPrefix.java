package com.caigouzi.other.bytedance;

/**
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * @author ：lihan
 * @description： 最长公共前缀
 * @date ：2020/9/26 14:47
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int min = Integer.MAX_VALUE;
        for (String s : strs) {
            min = Math.min(min, s.length());
        }
        if (min == 0) return "";
        int index = 0;
        char pre = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            for (String s : strs) {
                char charAt = s.charAt(index);
                if (pre != 0 && pre != charAt) {
                    return sb.toString();
                }
                pre = charAt;
            }
            index++;
            sb.append(pre);
            pre = 0;
            if (index >= min) {
                break;
            }
        }
        return sb.toString();
    }
}
