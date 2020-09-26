package com.caigouzi.string;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/31 10:06
 */
public class Num345 {
    HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
        if (s == null) return null;
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i < j) {
            char l = s.charAt(i);
            char r = s.charAt(j);
            if (!set.contains(l)) {
                result[i++] = l;
            } else if (!set.contains(r)) {
                result[j--] = r;
            } else {
                result[i++] = r;
                result[j--] = l;
            }
        }
        return new String(result);
    }
}
