package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 106. 从中序与后序遍历序列构造二叉树
 * @date ：2020/9/25 10:02
 */
public class Num106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return dfs(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    public TreeNode dfs(int[] inorder, int inStart, int inEnd, int[] postorder, int lastStart, int lastEnd) {
        if (inStart > inEnd || lastStart > lastEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[lastEnd]);
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == postorder[lastEnd]) {
                root.left = dfs(inorder, inStart, i - 1, postorder, lastStart, lastStart + i - inStart -1);
                root.right = dfs(inorder, i + 1, inEnd, postorder, lastStart + i - inStart, lastEnd - 1);
            }
        }
        return root;
    }
}
