package com.caigouzi.interview;

import java.util.Stack;

/**
 * @author ：lihan
 * @description： 剑指 Offer 09. 用两个栈实现队列
 * @date ：2020/8/22 17:20
 */
public class Offer09 {
    class CQueue {
        Stack<Integer> one = new Stack<Integer>();
        Stack<Integer> two = new Stack<Integer>();
        int size = 0;

        public CQueue() {

        }

        public void appendTail(int value) {
            one.push(value);
            size++;
        }

        public int deleteHead() {
            if (size == 0) {
                return -1;
            }
            if (two.isEmpty()) {
                while (!one.isEmpty()) {
                    two.push(one.pop());
                }
            }
            size--;
            return two.pop();
        }
    }
}
