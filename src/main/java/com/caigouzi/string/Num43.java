package com.caigouzi.string;

import java.math.BigInteger;

/**
 * @author ：lihan
 * @description： 43. 字符串相乘
 * @date ：2020/8/13 8:19
 */
public class Num43 {
    public String multiply(String num1, String num2) {

        BigInteger bigNum1 = new BigInteger(num1);
        BigInteger bigNum2 = new BigInteger(num2);
        BigInteger res = bigNum1.multiply(bigNum2);
        return res.toString();

    }
}
