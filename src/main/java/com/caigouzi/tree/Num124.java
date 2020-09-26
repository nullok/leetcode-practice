package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 输入: [-10,9,20,null,null,15,7]
 *
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 输出: 42
 * @author ：lihan
 * @description： 124. 二叉树中的最大路径和
 * @date ：2020/8/21 15:35
 */
public class Num124 {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 负数越加越小，不可能越加越大
        int left = Math.max(0, dfs(root.left));  // 最大值和当中，不可能有子树回溯的负数，也就是说，只要子树返回负数就 一定不会再最大和之中，所以直接取0
        int right = Math.max(0, dfs(root.right));
        res = Math.max(res, left + right + root.val);
        return Math.max(left, right) + root.val;

    }
}
