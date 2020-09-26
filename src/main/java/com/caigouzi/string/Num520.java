package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 520. 检测大写字母
 * @date ：2020/8/25 15:01
 */
public class Num520 {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        boolean one = true;
        // 检测是否全为大写
        for (char c : chars) {
            if (!(c >= 65 && c <= 90)) {
                one = false;
                break;
            }
        }

        boolean two = true;
        // 去掉首字母大写
        for (int i = 1; i < chars.length; i++) {
            if (!(chars[i] >= 97 && chars[i] <= 122)) {
                two = false;
                break;
            }
        }
        return one || two;
    }
}
