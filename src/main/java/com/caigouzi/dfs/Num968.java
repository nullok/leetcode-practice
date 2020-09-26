package com.caigouzi.dfs;

import com.caigouzi.tree.TreeNode;

/**
 * @author ：lihan
 * @description： 968. 监控二叉树
 * @date ：2020/9/22 13:29
 */
public class Num968 {
    int nums;
    public int minCameraCover(TreeNode root) {
        if (root == null) return 0;
        if (dfs(root) == 0) {
            nums++;
        }
        return nums;
    }

    // 三种状态，0 无覆盖  1 有覆盖 2 是有摄像头
    public int dfs(TreeNode root) {

        if (root == null) return 1;

        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left == 0 || right == 0) {
            nums++;
            return 2;
        } else if (left == 2 || right == 2) {
            return 1;
        } else if (left == 1 || right == 1) {
            return 0;
        }
        return -1;
    }

}
