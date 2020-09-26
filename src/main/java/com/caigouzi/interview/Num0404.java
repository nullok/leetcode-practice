package com.caigouzi.interview;

import com.caigouzi.tree.TreeNode;

/**
 * @author ：lihan
 * @description： 面试题 04.04. 检查平衡性
 * @date ：2020/8/18 17:01
 */
public class Num0404 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        if (Math.abs(left - right) > 1) {
            flag = false;
        }

        return Math.max(left, right) + 1;


    }
}
