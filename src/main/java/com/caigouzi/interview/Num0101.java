package com.caigouzi.interview;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：lihan
 * @description：  面试题 01.01. 判定字符是否唯一
 * @date ：2020/8/7 20:29
 */
public class Num0101 {

    //方法一
    public boolean isUnique1(String astr) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            characters.add(astr.charAt(i));
        }
        return characters.size() == astr.length();
    }
    // indexOf
    public boolean isUnique2(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            int index = astr.indexOf(astr.charAt(i));
            if (index != -1 && index != i) {
                return false;
            }
        }
        return true;
    }
    // 位运算
    public boolean isUnique(String astr) {
        int mark = 0;
        for (char c : astr.toCharArray()) {
            int move = c - 'a';
            if ((mark & (1 << move)) == 0) {
                mark |= (1 << move);
            } else {
                return false;
            }
        }
        return true;
    }

}
