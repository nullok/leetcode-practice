package com.caigouzi.disjoint_set;

/**
 * @author ：lihan
 * @description：
 * @date ：2020/9/17 19:19
 */
public class Num684 {
    int[] parents;
    int[] res;
    public int[] findRedundantConnection(int[][] edges) {
        parents = new int[edges.length + 1];
        for (int i = 1; i <= edges.length; i++) {
            parents[i] = i;
        }
        res = new int[2];
        for (int[] edge : edges) {
            if (union(edge[0], edge[1])) {
                res[0] = edge[0];
                res[1] = edge[1];
            }
        }
        return res;
    }

    int find(int x) {
        if (x != parents[x]) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }

    boolean union(int x, int y) {
        int resY = find(y);
        int resX = find(x);
        if (resY == resX) {
            return true;
        } else {
            parents[resX] = resY;
        }
        return false;
    }
}
