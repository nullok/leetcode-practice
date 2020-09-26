package com.caigouzi.array;

/**
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ：lihan
 * @description：
 * @date ：2020/9/2 18:00
 */
public class Num88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int oneIndex = m - 1;
        int twoIndex = n - 1;
        int mergeIndex = m + n - 1;
        while (oneIndex >= 0 || twoIndex >= 0) {
            if (oneIndex < 0) {
                nums1[mergeIndex--] = nums2[twoIndex--];
            } else if (twoIndex < 0) {
                nums1[mergeIndex--] = nums1[oneIndex--];
            } else if (nums1[oneIndex] < nums2[twoIndex]) {
                nums1[mergeIndex--] = nums2[twoIndex--];
            } else {
                nums1[mergeIndex--] = nums1[oneIndex--];
            }
        }
    }
}
