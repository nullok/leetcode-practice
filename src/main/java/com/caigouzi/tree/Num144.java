package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：lihan
 * @description：二叉树的前序遍历
 * @date ：2020/8/6 14:14
 */
public class Num144 {



    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(res, root);
        return res;
    }

    // 循环
    public void preorderTraversal2(List<Integer> res, TreeNode node) {
        // 存放右子树
        Stack<TreeNode> stack = new Stack<>();
        while ( node != null || !stack.isEmpty()){
            if (node != null) {
                res.add(node.val);
                stack.push(node.right);
                node = node.left;
            } else {
                node = stack.pop();
            }
        }
    }

    // 递归
    public void preorderTraversal(List<Integer> res, TreeNode node) {
        if (node.val == 0) {
            return;
        }
        res.add(node.val);
        preorderTraversal(res,node.left);
        preorderTraversal(res, node.right);
    }
}
