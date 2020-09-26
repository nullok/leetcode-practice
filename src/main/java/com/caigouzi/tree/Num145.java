package com.caigouzi.tree;

import java.util.*;

/**
 * @author ：lihan
 * @description： 145. 二叉树的后序遍历
 * @date ：2020/8/6 16:30
 */
public class Num145 {

    /**
     * 迭代的后序遍历可以 改成
     * 前序遍历的方向变一下
     * 正常前序遍历，根->左->右
     * 改成 根->右->左，相当于后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> tmp = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        while ( root != null || !stack.isEmpty()){
            if (root != null) {
                tmp.push(root.val);
                stack.push(root.left);
                root = root.right;
            } else {
                root = stack.pop();
            }
        }
        while (!tmp.isEmpty()) {
            res.add(tmp.pop());
        }
        return res;
    }
}
