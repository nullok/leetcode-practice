package com.caigouzi.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 *  逆波兰表达式求值
 * @author ：lihan
 * @description：
 * @date ：2020/8/5 20:27
 */
public class Num150 {

    public static void main(String[] args) {
        Num150 num150 = new Num150();
        int i = num150.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        System.out.println(i);
    }

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Stack<String> stack = new Stack<>();
        for (String ele : tokens) {
            try {
                int i = Integer.parseInt(ele);
                stack.push(String.valueOf(i));
            } catch (NumberFormatException e) {
                String topNum = stack.pop();
                String nextNum = stack.pop();
                String res = null;
                if (ele.equals("+")) {
                    res = String.valueOf(Integer.parseInt(topNum) + Integer.parseInt(nextNum));
                } else if (ele.equals("-")) {
                    res = String.valueOf(Integer.parseInt(nextNum) - Integer.parseInt(topNum));
                } else if (ele.equals("*")) {
                    res = String.valueOf(Integer.parseInt(topNum) * Integer.parseInt(nextNum));
                } else if (ele.equals("/")) {
                    res = String.valueOf(Integer.parseInt(nextNum) / Integer.parseInt(topNum));
                }
                stack.push(res);
            }
        }
        return Integer.parseInt(stack.pop());
    }
    public int evalRPN2(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String ele :
                tokens) {
            String res = null;
            switch (ele) {
                case "+":
                    String topNum1 = stack.pop();
                    String nextNum1 = stack.pop();
                    res = String.valueOf(Integer.parseInt(topNum1) + Integer.parseInt(nextNum1));
                    stack.push(res);
                    break;
                case "-":
                    String topNum2 = stack.pop();
                    String nextNum2 = stack.pop();
                    res = String.valueOf(Integer.parseInt(nextNum2) - Integer.parseInt(topNum2));
                    stack.push(res);

                    break;
                case "*":
                    String topNum3 = stack.pop();
                    String nextNum3 = stack.pop();
                    res = String.valueOf(Integer.parseInt(topNum3) * Integer.parseInt(nextNum3));
                    stack.push(res);

                    break;
                case "/":
                    String topNum = stack.pop();
                    String nextNum = stack.pop();
                    res = String.valueOf(Integer.parseInt(nextNum) / Integer.parseInt(topNum));
                    stack.push(res);
                    break;
                default:
                    stack.push(ele);
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
