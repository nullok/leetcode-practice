package com.caigouzi.dfs;

/**
 * 输入：
 * [[1,1,0],
 *  [1,1,0],
 *  [0,0,1]]
 * 输出：2
 * 解释：已知学生 0 和学生 1 互为朋友，他们在一个朋友圈。
 * 第2个学生自己在一个朋友圈。所以返回 2 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/friend-circles
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ：lihan
 * @description： 547. 朋友圈
 * @date ：2020/8/16 19:00
 */
public class Num547 {
    int[][] m;
    public int findCircleNum(int[][] M) {
        m = M;
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= m.length || j >= m[0].length || m[i][j] == 0) {
            return;
        }
        m[i][j] = 0;
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);

    }
}
