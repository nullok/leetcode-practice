package com.caigouzi.tree;

import com.caigouzi.list.ListNode;

/**
 * @author ：lihan
 * @description： 1367. 二叉树中的列表
 * @date ：2020/8/21 14:17
 */
public class Num1367 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (head.val != root.val) {
            return false;
        }
        return dfs(head.next, root.left) || dfs(head.next, root.right);
    }


}
