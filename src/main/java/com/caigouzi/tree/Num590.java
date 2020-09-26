package com.caigouzi.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 590. N叉树的后序遍历
 * @date ：2020/8/18 17:04
 */
public class Num590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return res;
    }

    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        for (Node node : root.children) {
            dfs(node);
        }
        res.add(root.val);

    }
}
