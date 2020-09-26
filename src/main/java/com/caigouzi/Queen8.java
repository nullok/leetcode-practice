package com.caigouzi;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/10 13:20
 */
public class Queen8 {
    private int Max = 8;
    private int[] arr = new int[Max];
    public static void main(String[] args) {
//        Queen8 queen8 = new Queen8();
//        queen8.check(0);
    }

    /**
     *
     * @param n 启示位置
     */
    public void check(int n) {
        if (n == Max) {
            print();
            return;
        }
        for (int i = 0; i < Max; i++) {
            arr[n] = i;
            if (verify(n)) {
                check(n + 1);
            }
        }
    }

    /**
     * 校验第n个皇后与前n-1是否符合规则
     * @param n
     * @return
     */
    public boolean verify(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(i - n) == Math.abs(arr[i] - arr[n])) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
