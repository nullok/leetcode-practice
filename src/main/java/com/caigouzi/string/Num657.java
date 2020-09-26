package com.caigouzi.string;

/**
 * @author ：lihan
 * @description： 657. 机器人能否返回原点
 * @date ：2020/8/28 13:57
 */
public class Num657 {
    public boolean judgeCircle(String moves) {
        int column = 0;
        int row = 0;
        char[] chars = moves.toCharArray();
        for (char c : chars) {

            switch (c) {
                case 'U':
                    column++;
                    break;
                case 'D':
                    column--;
                    break;
                case 'L':
                    row--;
                    break;
                case 'R':
                    row++;
                    break;
            }
        }

        return column == 0 && row == 0;
    }

}
