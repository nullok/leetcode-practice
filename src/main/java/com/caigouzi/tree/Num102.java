package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 102. 二叉树的层序遍历
 * @date ：2020/8/17 8:52
 */
public class Num102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<>();
            while (size > 0) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
            res.add(tmp);
        }
        return res;
    }
}
