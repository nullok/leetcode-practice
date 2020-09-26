package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 100. 相同的树
 * @date ：2020/8/7 18:53
 */
public class Num100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
