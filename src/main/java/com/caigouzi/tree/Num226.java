package com.caigouzi.tree;

import java.util.LinkedList;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/16 9:43
 */
public class Num226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
