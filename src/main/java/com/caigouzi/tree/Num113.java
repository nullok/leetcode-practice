package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 113. 路径总和 II
 * @date ：2020/8/21 16:49
 */
public class Num113 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum, new LinkedList<>());
        return res;
    }

    public void dfs(TreeNode root, int sum, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        if (root.left == null && root.right == null) {
            if ((sum - root.val == 0)) {
                res.add(new LinkedList<>(list));
            }
            list.removeLast();
            return;
        }
        dfs(root.left, sum - root.val, list);
        dfs(root.right, sum - root.val, list);
        list.removeLast();
    }
}
