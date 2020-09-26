package com.caigouzi.tree;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：lihan
 * @description： 501. 二叉搜索树中的众数
 * @date ：2020/9/24 16:07
 */
public class Num501 {
//    HashMap<Integer, Node> map = new HashMap<>();
//    class Node implements Comparable<Node>{
//        int value;
//        int count = 1;
//
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "value=" + value +
//                    ", count=" + count +
//                    '}';
//        }
//
//        public Node(int value) {
//            this.value = value;
//        }
//
//        @Override
//        public int compareTo(@NotNull Num501.Node o) {
//            return o.count - this.count;
//        }
//    }
//
//
//    public int[] findMode(TreeNode root) {
//        ArrayList<Node> list = new ArrayList<>();
//        dfs(root);
//        Collection<Node> collection = map.values();
//        List<Node> collect = collection.stream().sorted((x, y) -> y.count - x.count).collect(Collectors.toList());
//        int sum = -1;
//        int count = 0;
//        for (Node node : collect) {
//            if (sum == -1) {
//                sum = node.count;
//                count++;
//            } else if (node.count == sum) {
//                count++;
//            }
//        }
//
//        int[] ints = new int[count];
//        int index = 0;
//        for (Node node : collect) {
//            if (sum == -1) {
//                sum = node.count;
//                ints[index++] = node.value;
//            } else if (node.count == sum) {
//                ints[index++] = node.value;
//            }
//        }
//        return ints;
//    }
//
//    public void dfs(TreeNode root) {
//        if (root == null) return;
//        Node node = map.putIfAbsent(root.val, new Node(root.val));
//        if (node != null) {
//            node.count += 1;
//        }
//        dfs(root.left);
//        dfs(root.right);
//    }

    int preValue;
    int curTimes;
    int maxTimes;
    ArrayList<Integer> res = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] r = new int[res.size()];
        int index = 0;
        for (Integer i : res) {
            r[index++] = i;
        }
        return r;
    }

    public void dfs(TreeNode root) {
        if (root == null ) return;
        dfs(root.left);
        if (root.val == preValue) {
            curTimes++;
        } else {
            curTimes = 1;
            preValue = root.val;
        }

        if (curTimes == maxTimes) {
            res.add(root.val);
        } else if (curTimes > maxTimes) {
            res.clear();
            res.add(root.val);
            maxTimes = curTimes;
        }
        dfs(root.right);
    }

    public static void main(String[] args) {
        int[] res = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5,5};
        int preValue = 0;
        int curTimes = 0;
        int maxTimes = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int re : res) {
            if (re == preValue) {
                curTimes++;
            } else {
                preValue = re;
                curTimes = 1;
            }

            if (curTimes == maxTimes) {
                arr.add(re);
            } else if (curTimes > maxTimes) {
                arr.clear();
                arr.add(re);
                maxTimes = curTimes;
            }
        }

        System.out.println(arr);

    }
}
