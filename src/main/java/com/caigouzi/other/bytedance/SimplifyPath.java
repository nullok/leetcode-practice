package com.caigouzi.other.bytedance;

import java.util.LinkedList;

/**
 * 输入："/a/../../b/../c//.//"
 * 输出："/c"
 * @author ：lihan
 * @description： 简化路径
 * @date ：2020/9/26 15:55
 */
public class SimplifyPath {
    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/a/../../b/../c//.//"));;
    }
    public String simplifyPath(String path) {
        String[] split = path.split("/+");
        LinkedList<String> list = new LinkedList<>();
        for (String s : split) {
            if (s.equals("")) {
                continue;
            }
            if (s.equals("..")) {
                if (list.size() == 0) {
                    continue;
                } else {
                    list.removeLast();
                    continue;
                }
            }
            if (s.equals(".")) {
                continue;
            }
            list.addLast(s);

        }
        if (list.size() == 0) {
            return "/";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            for (String s : list) {
                sb.append(s);
                sb.append("/");
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
    }
}
