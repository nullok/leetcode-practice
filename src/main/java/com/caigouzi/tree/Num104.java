package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 104. 二叉树的最大深度
 * @date ：2020/8/8 19:56
 */
public class Num104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftLen = maxDepth(root.left);
        int rightLen = maxDepth(root.right);
        return leftLen > rightLen ? leftLen + 1 : rightLen + 1;
    }
}
