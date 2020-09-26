package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：lihan
 * @description： 145. 二叉树的中序遍历
 * @date ：2020/8/6 16:30
 */
public class Num94 {

    // 迭代法
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode parent = stack.pop();
                res.add(parent.val);
                root = parent.right;
            }
        }

        return res;
    }
}
