package com.caigouzi.erveryday;

import com.caigouzi.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/26 14:22
 */
public class Day20200926 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, new LinkedList<>(), sum);
        return res;
    }

    public void dfs(TreeNode root, LinkedList<Integer> list,int sum) {
        if (root == null || sum < 0) {
            return;
        }

        list.addLast(root.val);
        if (root.left == null && root.right == null) {
            if (sum-root.val == 0) {
                res.add(new ArrayList<>(list));
                list.removeLast();
                return;
            }
        }
        dfs(root.left, list, sum - root.val);
        dfs(root.right, list, sum - root.val);
        list.removeLast();
    }


}
