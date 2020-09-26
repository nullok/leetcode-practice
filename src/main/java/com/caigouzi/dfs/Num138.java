package com.caigouzi.dfs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：lihan
 * @description： 138. 复制带随机指针的链表
 * @date ：2020/8/12 14:37
 */
public class Num138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    Map<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (map.containsKey(head)) {
            return map.get(head);
        }

        Node node = new Node(head.val);
        map.put(head, node);
        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);
        return node;
    }


}
