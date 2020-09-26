package com.caigouzi.jian_zhi;

import com.caigouzi.tree.TreeNode;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/17 14:49
 */
public class Offer55 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    public int dfs(TreeNode root) {
        if (root == null || !flag) {
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (Math.abs(left - right) > 1) {
            flag = false;
        }

        return Math.max(left, right) + 1;
    }
}
