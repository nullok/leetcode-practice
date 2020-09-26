package com.caigouzi.jian_zhi;

/**
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * @author ：lihan
 * @description： 剑指 Offer 05. 替换空格
 * @date ：2020/9/25 13:35
 */
public class Offer05 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
