package com.caigouzi.tree;

import java.util.*;

/**
 * @author ：lihan
 * @description： 99. 恢复二叉搜索树
 * @date ：2020/8/8 14:00
 */
public class Num99 {
    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 2};
        Arrays.sort(ints);
        for (int i:
             ints) {
            System.out.println(i);
        }
    }
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<>();
        inorderTraversal(nums,root);
        Collections.sort(nums);
        inorderTraversal(root,nums);
    }

    public void inorderTraversal(TreeNode root,List<Integer> list) {
        TreeNode help = root;
        Stack<TreeNode> stack = new Stack<>();
        int i = 0;
        while (help != null || !stack.isEmpty()) {
            if (help != null) {
                stack.push(help);
                help = help.left;
            } else {
                TreeNode parent = stack.pop();
                parent.val = list.get(i++);
                help = parent.right;
            }
        }
    }
    public void inorderTraversal(List<Integer> list, TreeNode node) {
        if (node == null) return;
        inorderTraversal(list,node.left);
        list.add(node.val);
        inorderTraversal(list,node.left);
    }
}
