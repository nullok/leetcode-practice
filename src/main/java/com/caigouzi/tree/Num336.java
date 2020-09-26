package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入：["abcd","dcba","lls","s","sssll"]
 * 输出：[[0,1],[1,0],[3,2],[2,4]]
 * 解释：可拼接成的回文串为 ["dcbaabcd","abcddcba","slls","llssssll"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ：lihan
 * @description： 336. 回文对
 * @date ：2020/8/7 19:17
 */
public class Num336 {
    public static void main(String[] args) {
        String[] s = new String[]{"a",""};
        Num336 num336 = new Num336();
        System.out.println(num336.palindromePairs(s));
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                boolean palindrome = isPalindrome(words[i] + words[j]);
                if (palindrome) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i); temp.add(j);
                    res.add(temp);
                }

            }
        }
        return res;
    }

    public boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return str.hashCode() == stringBuilder.toString().hashCode();
    }
}
