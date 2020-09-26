package com.caigouzi.bfs;

import com.caigouzi.dfs.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/8/12 11:02
 */
public class Num133BFS {
    public Node cloneGraph(Node node) {

        HashMap<Integer, Node> map = new HashMap<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node root = queue.remove();
            for (Node neighbor : root.neighbors) {
                if (!map.containsKey(neighbor.val)) {
                    map.put(neighbor.val, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                map.get(root.val).neighbors.add(map.get(neighbor.val));
            }
        }
        return map.get(node.val);
    }
}
