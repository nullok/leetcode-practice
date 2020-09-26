package com.caigouzi.array;

import java.util.Arrays;

/**
 * @author ：lihan
 * @description： 645. 错误的集合
 * @date ：2020/8/23 14:29
 */
public class Num645 {
    public static void main(String[] args) {
        findErrorNums2(new int[]{1, 2, 3, 4, 6, 6, 7});
    }
    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                res[0] = nums[i];
                break;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
    public static int[] findErrorNums2(int[] nums) {
        int[] tempt = new int[nums.length+1];
        int[] res = new int[2];
        for(int num:nums){
            tempt[num]++;
        }
        for(int i=1;i<tempt.length;i++){
            if(tempt[i]==1) continue;
            if(tempt[i]==2) res[0]=i;
            else res[1]=i;
        }
        return res;
    }
}
