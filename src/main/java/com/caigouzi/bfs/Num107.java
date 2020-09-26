package com.caigouzi.bfs;

import com.caigouzi.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author ：lihan
 * @description： 107. 二叉树的层次遍历 II
 * @date ：2020/9/6 16:04
 */
public class Num107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        LinkedList<TreeNode> map = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        map.offer(root);
        while (!map.isEmpty()) {
            ArrayList<Integer> item = new ArrayList<>();
            int count = map.size();
            while (count > 0) {
                TreeNode node = map.poll();
                item.add(node.val);
                if (node.left != null) {
                    map.offer(node.left);
                }
                if (node.right != null) {
                    map.offer(node.right);
                }
                count--;
            }
            stack.push(item);

        }
        ArrayList<List<Integer>> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

}
