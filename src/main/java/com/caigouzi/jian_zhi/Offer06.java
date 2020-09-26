package com.caigouzi.jian_zhi;

import com.caigouzi.list.ListNode;

/**
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * 限制：
 *
 * 0 <= 链表长度 <= 10000
 * @author ：lihan
 * @description： 剑指 Offer 06. 从尾到头打印链表
 * @date ：2020/9/25 13:41
 */
public class Offer06 {
    int[] res = new int[10000];
    int index;
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return res;
        }
        dfs(head);
        int[] r = new int[index];
        for (int i = 0; i < index; i++) {
            r[i] = res[i];
        }
        return r;
    }

    public void dfs(ListNode head) {
        if (head == null) return;
        dfs(head.next);
        res[index++] = head.val;
    }
}
