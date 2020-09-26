package com.caigouzi.tree;

/**
 * @author ：lihan
 * @description： 105. 从前序与中序遍历序列构造二叉树
 * @date ：2020/9/25 10:47
 */
public class Num105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode dfs(int[] pre, int preS, int preE, int[] in, int inS, int inE) {
        if (preS > preE || inS > inE) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preS]);
        for (int i = inS; i <= inE; i++) {
            if (in[i] == pre[preS]) {
                root.left = dfs(pre, preS + 1, preS + i - inS, in, inS, i - 1);
                root.right = dfs(pre, preS + i - inS + 1, preE, in, i + 1, inE);
            }
        }
        return root;
    }
}
