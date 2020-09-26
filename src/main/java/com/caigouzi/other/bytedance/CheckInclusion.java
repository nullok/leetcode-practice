package com.caigouzi.other.bytedance;

import java.util.ArrayList;

/**
 * 输入: s1 = "ab" s2 = "eidbaooo"
 * 输出: True
 * 解释: s2 包含 s1 的排列之一 ("ba").
 * @author ：lihan
 * @description： 字符串的排列
 * @date ：2020/9/26 20:26
 */
public class CheckInclusion {

    public static void main(String[] args) {
        CheckInclusion checkInclusion = new CheckInclusion();
        checkInclusion.checkInclusion("abc", "eidboacboo");
    }
    String S;
    ArrayList<String> res = new ArrayList<>();
    public boolean checkInclusion(String s1, String s2) {
        S = s2;
        dfs(s1.toCharArray(), -1,0, new StringBuilder());
        System.out.println(res);
        return false;
    }


    public void dfs(char[] arr,int upon, int index, StringBuilder sb) {
        if (index >= arr.length) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i!= 0 && i == index) continue;
            sb.append(arr[i]);
            if (sb.length() == arr.length) {
                res.add(sb.toString());
            } else {
                dfs(arr, i,i + 1, sb);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
