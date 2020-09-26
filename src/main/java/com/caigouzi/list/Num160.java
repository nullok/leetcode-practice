package com.caigouzi.list;

/**
 * @author ：lihan
 * @description： 160. 相交链表
 * @date ：2020/8/14 14:27
 */
public class Num160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;

        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
