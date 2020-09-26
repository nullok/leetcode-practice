package com.caigouzi.tree;

import java.util.Optional;

/**
 * @author ：lihan
 * @description： 617. 合并二叉树
 * @date ：2020/9/23 10:12
 */
public class Num617 {
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode left = null;
        TreeNode right = null;
        int v1 = 0, v2 = 0;

        if (t1 != null && t2 != null) {
            left = mergeTrees(t1.left, t2.left);
            right = mergeTrees(t1.right, t2.right);
        } else if (t1 != null) {
            left = t1.left;
            right = t1.right;
        } else {
            left = t2.left;
            right = t2.right;
        }

        if (t1 != null) {
            v1 = t1.val;
        }
        if (t2 != null) {
            v2 = t2.val;
        }
        TreeNode root = new TreeNode(v1 + v2);
        root.left = left;
        root.right = right;
        return root;
    }
    // two
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      if (t1 == null) return t2;
      if (t2 == null) return t1;
        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
