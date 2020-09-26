package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 257. 二叉树的所有路径
 * @date ：2020/9/4 14:03
 */
public class Num257 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        LinkedList<String> list = new LinkedList<>();
//        list.add(root.val + "");
        dfs(root,list);
//        dfs(root.left, list);
//        dfs(root.right, list);/**/
        return res;
    }

    public void dfs(TreeNode root, LinkedList<String> list) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {

            StringBuilder sb = new StringBuilder();
            for (String s : list) {
                sb.append(s);
                sb.append("->");
            }
            sb.append(root.val);
            res.add(sb.toString());
            return;
        }
        list.add(root.val + "");
        dfs(root.left, list);
        dfs(root.right, list);
        list.removeLast();
    }
}
