package com.caigouzi.tree;

import java.util.LinkedList;

/**
 * 例如，给定二叉树
 *
 *     1
 *    / \
 *   2   5
 *  / \   \
 * 3   4   6
 * 将其展开为：
 *
 * 1
 *  \
 *   2
 *    \
 *     3
 *      \
 *       4
 *        \
 *         5
 *          \
 *           6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ：lihan
 * @description： 114. 二叉树展开为链表
 * @date ：2020/8/17 14:56
 */
public class Num114 {
    LinkedList<TreeNode> r = new LinkedList<>();
    public void flatten1(TreeNode root) {
        if (root == null ) return;
        TreeNode head = root;
        dfs(root);
        r.poll();
        root.left = null;
        while (r.isEmpty()) {
            head.right = r.poll();
            head.left = null;
            head = head.right;
        }
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        r.add(root);
        dfs(root.left);
        dfs(root.right);
    }

    // 最牛逼的解法
    // 题目 第一印象是  前序遍历的结果，
    // 此揭解法的思路是 使用 先右后左的  后序遍历，即 前序遍历的逆序，
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root == null) return;

        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
