package com.caigouzi.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author ：lihan
 * @description： 316. 去除重复字母
 * @date ：2020/8/7 9:55
 */
public class Num316 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
    public  static String removeDuplicateLetters(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c=s.charAt(i);
            if(stack.contains(c))
                continue;
            while(!stack.isEmpty()&&stack.peek()>c&&s.indexOf(stack.peek(),i)!=-1)
                stack.pop();
            stack.push(c);
        }
        char chars[]=new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            chars[i]=stack.get(i);
        }
        return new String(chars);
    }

}
