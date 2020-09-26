package com.caigouzi.dfs;

import com.caigouzi.tree.TreeNode;

/**
 * @author ：lihan
 * @description： 1038. 从二叉搜索树到更大和树
 * @date ：2020/9/21 9:07
 */
public class Num1038 {
    int sum;
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;
        TreeNode right = bstToGst(root.right);
        root.val = root.val + sum;
        sum = root.val;
        bstToGst(root.left);
        return root;
    }
}
