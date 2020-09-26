package com.caigouzi.stack;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 输入："abbaca"
 * 输出："ca"
 *
 * @author ：lihan
 * @description： 1047. 删除字符串中的所有相邻重复项
 * @date ：2020/8/22 18:09
 */
public class Num1047 {
    public static void main(String[] args) {
        System.out.println("1223".substring(4));
        System.out.println(removeDuplicates1("aababaab"));;

    }

    public static String removeDuplicates(String S) {

        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if ((i + 1 < S.length()) && S.charAt(i) == S.charAt(i + 1)) {
                if (tmp.length() > 0) {
                    return removeDuplicates(tmp.toString() + S.substring(i + 2));
                } else {

                    return removeDuplicates(S.substring(i + 2));
                }

            } else {
                tmp.append(S.charAt(i));
            }
        }
        return S;
    }

    public static String removeDuplicates1(String S) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                Character top = stack.peek();
                if (top.equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        if (stack.size() == 0) {
            return "";
        }
        char[] cc = new char[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            cc[index++] = stack.removeFirst();
        }
        return new String(cc);
    }

}
