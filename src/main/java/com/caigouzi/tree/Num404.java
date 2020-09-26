package com.caigouzi.tree;

import java.util.LinkedList;

/**
 * @author ：lihan
 * @description： 404. 左叶子之和
 * @date ：2020/8/18 17:17
 */
public class Num404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    count += node.left.val;
                }
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return count;
    }

    public int dfs(TreeNode node) {
        if (node == null ) return 0;
        if (node.left != null && node.left.left == null && node.left.right == null) {
            return node.val;
        }
        return dfs(node.left) + dfs(node.right);
    }
}
