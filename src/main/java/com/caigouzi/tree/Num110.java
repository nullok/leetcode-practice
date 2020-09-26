package com.caigouzi.tree;

/**
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 * @author ：lihan
 * @description： 110. 平衡二叉树
 * @date ：2020/8/17 8:40
 */
public class Num110 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDeep = dfs(root.left);
        int rightDeep = dfs(root.right);
        if (Math.abs(leftDeep - rightDeep) > 1) {
            flag = false;
        }
        return Math.max(leftDeep, rightDeep);
    }

}
