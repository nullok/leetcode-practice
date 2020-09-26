package com.caigouzi.tree;

import java.util.LinkedList;

/**
 * @author ：lihan
 * @description： 173. 二叉搜索树迭代器
 * @date ：2020/8/19 12:08
 */
public class Num173 {
    class BSTIterator {
        LinkedList<Integer> n = new LinkedList<>();
        public BSTIterator(TreeNode root) {
            dfs(root);
        }
        public void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            n.add(root.val);
            dfs(root.right);
        }

        /** @return the next smallest number */
        public int next() {
            return n.removeFirst();
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !n.isEmpty();
        }
    }
}
