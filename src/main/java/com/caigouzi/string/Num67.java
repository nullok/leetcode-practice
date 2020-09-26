package com.caigouzi.string;

import java.math.BigInteger;
import java.util.Stack;

/**
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * @author ：lihan
 * @description： 67. 二进制求和
 * @date ：2020/8/13 15:05
 */
public class Num67 {
    public static void main(String[] args) {
        System.out.println('1' - '0');

    }
    public String addBinary(String a, String b) {
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);
        BigInteger add = bigA.add(bigB);
        return add.toString(2);
    }

    public String other(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aLen = a.length() - 1, bLen = b.length() - 1, carry = 0;
        while (aLen >= 0 || bLen >= 0) {
            int sum = carry;
            if (aLen >= 0) {
                sum += a.charAt(aLen) - '0';
                aLen--;
            }
            if (bLen >= 0) {
                sum += b.charAt(bLen) - '0';
                bLen--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }


}
