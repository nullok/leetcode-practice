package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 344. 反转字符串
 * @date ：2020/8/28 14:40
 */
public class Num344 {
    public void reverseString(char[] s) {
        recursion(0, s);
    }

    public void recursion(int index, char[] chars) {
        if (index >= chars.length) {
            return;
        }

        char aChar = chars[index];
        recursion(index + 1, chars);
        chars[chars.length - index - 1] = aChar;
    }
}
