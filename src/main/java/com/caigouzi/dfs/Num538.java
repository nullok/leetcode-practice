package com.caigouzi.dfs;

import com.caigouzi.tree.TreeNode;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/21 8:50
 */
public class Num538 {
    int num = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            //遍历右子树
            convertBST(root.right);
            //遍历顶点
            root.val = root.val + num;
            num = root.val;
            //遍历左子树
            convertBST(root.left);
            return root;
        }
        return null;
    }
}
