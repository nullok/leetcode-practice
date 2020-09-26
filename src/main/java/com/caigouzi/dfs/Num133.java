package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * class Node {
 *     public int val;
 *     public List<Node> neighbors;
 *
 *     public Node() {
 *         val = 0;
 *         neighbors = new ArrayList<Node>();
 *     }
 *
 *     public Node(int _val) {
 *         val = _val;
 *         neighbors = new ArrayList<Node>();
 *     }
 *
 *     public Node(int _val, ArrayList<Node> _neighbors) {
 *         val = _val;
 *         neighbors = _neighbors;
 *     }
 * }
 * @author ：lihan
 * @description： 133. 克隆图
 * @date ：2020/8/12 10:09
 */
public class Num133 {
    public Map<Integer, Node> map = new HashMap<>();
    // dfs
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return dfs(node);
    }

    public Node dfs(Node root) {
        if (map.containsKey(root.val)) {
            return map.get(root.val);
        }

        Node node = new Node(root.val);
        map.put(root.val, node);
        for (Node neighbor : root.neighbors) {
            node.neighbors.add(dfs(neighbor));
        }
        return node;
    }




}
