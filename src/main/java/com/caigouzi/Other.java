package com.caigouzi;

import com.caigouzi.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/12 10:41
 */
public class Other {
    public int calculate(String s) {
        int x = 1, y = 0;

        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'A':
                    x = 2 * x + y;
                    break;
                case 'B':
                    y = 2 * y + x;
            }
        }
        return x + y;
    }

    public static void main(String[] args) {
        Other other = new Other();
        System.out.println(other.minimumOperations("rrryyyrryyyrr"));;
    }
    public int minimumOperations(String leaves) {
        char[] chars = leaves.toCharArray();
        int count = 0;
        if (chars[0] != 'r') {
            count++;
            chars[0] = 'r';
        }
        if (chars[leaves.length() - 1] != 'r') {
            count++;
            chars[leaves.length() - 1] = 'r';
        }
        int preIndex = 0;
        int lastIndex = chars.length - 1;
        while (preIndex < lastIndex) {
            if (chars[preIndex] == 'r') {
                preIndex++;
            }
            if (chars[lastIndex] == 'r') {
                lastIndex--;
            }
            if (chars[preIndex] == 'y' && chars[lastIndex] == 'y') {
                break;
            }
        }
        for (int i = preIndex; i <= lastIndex; i++) {
            if (chars[i] == 'r') {
                count++;
            }
        }
        return count;
    }
}
