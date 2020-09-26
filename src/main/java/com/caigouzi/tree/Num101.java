package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 101. 对称二叉树
 * @date ：2020/8/8 19:47
 */
public class Num101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (left==null && right == null) return true;
        if (left== null || right == null) return false;
        if (left.val != right.val) return false;
        return check(left.left, right.right) && check(left.right, right.left);
    }
}
