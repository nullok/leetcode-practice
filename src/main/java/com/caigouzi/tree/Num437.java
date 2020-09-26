package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 437. 路径总和 III
 * @date ：2020/8/21 17:06
 */
public class Num437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return count(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    int count = 0;
    public int count(TreeNode root, int sum) {
        count = 0;
        dfs(root, sum);
        return count;
    }
    public void dfs(TreeNode node,int sum) {
        if (node == null) {
            return;
        }
        if (sum - node.val == 0) {
            count++;
        }
        dfs(node.left, sum - node.val);
        dfs(node.right, sum - node.val);
    }
}
