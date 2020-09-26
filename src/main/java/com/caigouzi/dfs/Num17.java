package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 17. 电话号码的字母组合
 * @date ：2020/8/26 18:18
 */
public class Num17 {
    String[][] map = {
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"},
    };
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        dfs(digits, new LinkedList<>());
        return res;
    }

    public void dfs(String digits, LinkedList<String> list) {
        if (digits.length() == 0) return;
        int index = Integer.parseInt(digits.substring(0, 1));
        String[] strings = map[index - 2];
        String nextDigits = digits.substring(1);
        for (String s : strings) {
            list.add(s);
            if (nextDigits.length() > 0) {
                dfs(nextDigits, list);
            } else {
                StringBuilder c = new StringBuilder();
                for (String ss : list) {
                    c.append(ss);
                }
                res.add(c.toString());
            }
            list.removeLast();
        }
    }
}
