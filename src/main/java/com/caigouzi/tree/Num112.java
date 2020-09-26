package com.caigouzi.tree;

/**
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ：lihan
 * @description： 112. 路径总和
 * @date ：2020/8/21 16:25
 */
public class Num112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if (root.left == null && root.right == null) {
            return (sum - root.val) == 0;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
