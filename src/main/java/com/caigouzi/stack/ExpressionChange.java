package com.caigouzi.stack;

import java.util.Stack;

/**
 * 中缀表达式转后缀表达式
 * @author ：lihan
 * @description：
 * @date ：2020/8/6 11:12
 */
public class ExpressionChange {
    public static void main(String[] args) {
        String s = toChange("(1+(4+5+2)-3)+(6+8)+(-8)");
        System.out.println(s);
    }

    public static String toChange(String str) {
        StringBuilder res = new StringBuilder();
        Stack<String> opr = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            String o = str.substring(i, i + 1);
            switch (o) {
                case " ":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    if (opr.isEmpty()) {
                        opr.push(o);
                    } else {
                        String top = opr.peek();
                        // top不能为(
                        while (!top.equals("(") && priority(top) >= priority(o)) {
                            String pop = opr.pop();
                            res.append(pop);
                            if (opr.isEmpty()) {
                                break;
                            } else {
                                top = opr.peek();
                            }
                        }
                        opr.push(o);
                    }
                    break;
                case "(":
                    opr.push(o);
                    break;
                case ")":
                    String top = opr.pop();
                    while (!top.equals("(")) {
                        res.append(top);
                        if (opr.isEmpty()) {
                            break;
                        } else {
                            top = opr.pop();
                        }
                    }

                    break;
                default:
                    res.append(o);
            }
        }
        while (!opr.isEmpty()) {
            res.append(opr.pop());
        }
        return res.toString();
    }

    /**
     * 获得优先级，返回值越大优先级越高
     * @param b
     * @return
     */
    public static int priority(String b) {
        switch (b) {
            case "*":
            case "/":
                return 1;
            case "+":
            case "-":
                return 0;
            case "(":
                return 2;
            default:
                return -1;
        }
    }
}
