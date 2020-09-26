package com.caigouzi.interview;

import com.caigouzi.tree.TreeNode;

/**
 * @author ：lihan
 * @description： 面试题 04.10. 检查子树
 * @date ：2020/8/21 15:12
 */
public class Num0410 {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null) {
            return false;
        }
        if (t2 == null) return false;
        return dfs(t1, t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }

    public boolean dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return false;
        }
        if (t2 == null) return false;

        if (t1.val == t2.val) {
            return true;
        }
        return dfs(t1.left, t2.left) && dfs(t1.right, t2.right);
    }
}
