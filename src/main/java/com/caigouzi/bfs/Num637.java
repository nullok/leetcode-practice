package com.caigouzi.bfs;

import com.caigouzi.tree.TreeNode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/6 16:26
 */
public class Num637 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

    }
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> map = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        map.add(root);
        while (!map.isEmpty()) {
            int size = map.size();
            int count = map.size();
            long total = 0L;
            while (count > 0) {
                TreeNode node = map.poll();
                total += node.val;
                if (node.left != null) {
                    map.offer(node.left);
                }
                if (node.right != null) {
                    map.offer(node.right);
                }
                count--;
            }

            double average = total * 1.0 / size;
            res.add(average);
        }

        return res;
    }
}
