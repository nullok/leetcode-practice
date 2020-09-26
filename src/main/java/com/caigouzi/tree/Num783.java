package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 783. 二叉搜索树节点最小距离
 * @date ：2020/8/10 13:11
 */
public class Num783 {
    private TreeNode pre = null;   //pre记录前一节点
    private int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        if(pre != null){
            res = Math.min(root.val-pre.val,res);   //记录最小
        }
        pre = root;
        dfs(root.right);
    }
}
