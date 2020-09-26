package com.caigouzi;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 93. 复原IP地址
 * @date ：2020/8/9 11:52
 */
public class Num93 {
    public static void main(String[] args) {
        String S = "12345";
        System.out.println(S.substring(0, 2));
        Num93 num93 = new Num93();
//        System.out.println(num93.restoreIpAddresses("25525511135"));
        System.out.println(num93.check("25525511135"));
    }

    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<>();
        check(res, s);
        return res;
    }

    public boolean check(List<String> res, String s) {
        if (s.length() == 0) return false;
        if (s.length() <= 3) {
            if (verfiyNum(s)) {
                res.add(s);
                return true;
            } else {
                return false;
            }
        } else {
            if (check(res, s.substring(3))) {
                String tmp = s.substring(0, 3);
                if (verfiyNum(tmp)) {
                    res.add(tmp);
                }
                return false;
            }
            if (check(res, s.substring(2))) {
                String tmp = s.substring(0, 2);
                if (verfiyNum(tmp)) {
                    res.add(tmp);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public String check(String s) {
        if (s.length() == 0) return null;
        if (s.length() <= 3) {
            if (verfiyNum(s)) {
                return s;
            } else {
                return null;
            }
        } else {
            String check3 = check(s.substring(3));
            if (check3 != null) {
                String tmp = s.substring(0, 3);
                if (verfiyNum(tmp)) {
                    return tmp + "." + check3;
                } else {
                    return null;
                }
            }
            String check2 = check(s.substring(2));
            if (check2 != null) {
                String tmp = s.substring(0, 2);
                if (verfiyNum(tmp)) {
                    return tmp + "." + check2;
                } else {
                    return null;
                }
            }
            String check1 = check(s.substring(1));
            if (check1 != null) {
                String tmp = s.substring(0, 1);
                if (verfiyNum(tmp)) {
                    return tmp + "." + check1;
                } else {
                    return null;
                }
            }

            return null;
        }

    }

    public boolean verfiyNum(String s) {
        int i = Integer.parseInt(s);
        return i >= 0 && i <= 255;
    }

}
