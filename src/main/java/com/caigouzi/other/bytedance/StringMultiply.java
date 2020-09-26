package com.caigouzi.other.bytedance;

import java.util.ArrayList;

/**
 * num1 = "123", num2 = "456"
 * @author ：lihan
 * @description： 字符串相乘
 * @date ：2020/9/26 16:39
 */
public class StringMultiply {
    public static void main(String[] args) {
        StringMultiply stringMultiply = new StringMultiply();
        long start = System.currentTimeMillis();
        System.out.println(stringMultiply.multiply("223423423423423424234"
                , "3234234234234234234234234234"));
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        System.out.println(stringMultiply.multiply2("223423423423423424234"
                , "3234234234234234234234234234"));
        end = System.currentTimeMillis();
        System.out.println(end - start);


        start = System.currentTimeMillis();
        System.out.println(stringMultiply.multiply3("223423423423423424234"
                , "3234234234234234234234234234"));
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
//        ArrayList<String> res = new ArrayList<>();
        String ress = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len1; i++) {
            long a = num1.charAt(len1 - i - 1) - '0';
            long carry = 0;
            String lineTotal = "";
            int j;
            for (j = 0; j < len2; j++) {
                long b = num2.charAt((len2 - j - 1)) - '0';
                long s = (a * b + carry);
                carry = s / 10;
                sb.append(s % 10);
                for (int k = 0; k < j; k++) {
                    sb.append("0");
                }
                lineTotal = sum(lineTotal, sb.toString());
                sb.delete(0, sb.length());
            }
            sb.append(lineTotal);
            for (int k = 0; k < i; k++) {
                sb.append("0");
            }
            if (carry != 0) {
                ress = sum(ress, carry + sb.toString());
            } else {
                ress = sum(ress, sb.toString());
            }
            sb.delete(0, sb.length());
        }

        return ress;
    }

    public String multiply3(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        // 保存计算结果
        String res = "0";

        // num2 逐位与 num1 相乘
        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            // 保存 num2 第i位数字与 num1 相乘的结果
            StringBuilder temp = new StringBuilder();
            // 补 0
            for (int j = 0; j < num2.length() - 1 - i; j++) {
                temp.append(0);
            }
            int n2 = num2.charAt(i) - '0';

            // num2 的第 i 位数字 n2 与 num1 相乘
            for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
                int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
                int product = (n1 * n2 + carry) % 10;
                temp.append(product);
                carry = (n1 * n2 + carry) / 10;
            }
            // 将当前结果与新计算的结果求和作为新的结果
            res = addStrings(res, temp.reverse().toString());
        }
        return res;
    }
    public String multiply2(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int len1 = num1.length();
        int len2 = num2.length();
//        ArrayList<String> res = new ArrayList<>();
        String ress = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len1; i++) {
            long a = num1.charAt(len1 - i - 1) - '0';
            long carry = 0;
            String lineTotal = "";
            int j;
            for (j = 0; j < len2; j++) {
                long b = num2.charAt((len2 - j - 1)) - '0';
                long s = (a * b + carry);
                carry = s / 10;
                sb.append(s % 10);
                for (int k = 0; k < j; k++) {
                    sb.append("0");
                }
                lineTotal = addStrings(lineTotal, sb.toString());
                sb.delete(0, sb.length());
            }
            sb.append(lineTotal);
            for (int k = 0; k < i; k++) {
                sb.append("0");
            }
            if (carry != 0) {
                ress = addStrings(ress, carry + sb.toString());
            } else {
                ress = addStrings(ress, sb.toString());
            }
            sb.delete(0, sb.length());
        }

        return ress;
    }

    public String sum(String str1, String str2) {
        if (str1.length() == 0) return str2;
        if (str2.length() == 0) return str1;
        char[] charOne = str1.toCharArray();
        char[] charTwo = str2.toCharArray();
        int len1 = charOne.length;
        int len2 = charTwo.length;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (true) {
            if (index >= len1 || index >= len2) {
                break;
            }
            int one = charOne[len1 - index - 1] - '0';
            int two = charTwo[len2 - index - 1] - '0';
            int s = one + two + carry;
            carry = s / 10;
            sb.append(s % 10);
            index++;
        }
        if (index < len1) {
            for (int i = index; i < len1; i++) {
                int c = charOne[len1 - i - 1] - '0';
                int s = c + carry;
                carry = s / 10;
                sb.append(s % 10);
            }
        }
        if (index < len2) {
            for (int i = index; i < len2; i++) {
                int c = charTwo[len2 - i - 1] - '0';
                int s = c + carry;
                carry = s / 10;
                sb.append(s % 10);
            }
        }
        String s = sb.reverse().toString();
        if (carry != 0) {
            return carry + s;
        } else {
            return s;
        }
    }

    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1;
             i >= 0 || j >= 0 || carry != 0;
             i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            builder.append(sum);
            carry = (x + y + carry) / 10;
        }
        return builder.reverse().toString();
    }
}
