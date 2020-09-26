package com.caigouzi.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author ：lihan
 * @description ： 40. 组合总和 II
 * @date ：2020/8/15 15:28
 */
public class Num40 {
    public static void main(String[] args) {
        int[] re = {10, 1, 2, 7, 6, 1, 5};
        Num40 num40 = new Num40();
        System.out.println(num40.combinationSum2(re, 8));

    }
/*    int[] candidates;
    ArrayList<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum22(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates=candidates;
        helper(0,target);
        return res;
    }
    *//**
     * @index: 开始寻找的位置
     * @target: 目标数
     *//*
    void helper(int index,int target){
        int last=-1;
        for(int i=index;i<candidates.length;i++){
            //防止出现重复的结果
            if(candidates[i]==last)continue;
            //当前数小于等于目标数才可能找到目标组合
            if(candidates[i]<=target){
                list.add(candidates[i]);
                //若找到组合则添加进结果
                if(candidates[i]==target)
                    res.add((List<Integer>)list.clone());
                    //否则在右边接着寻找
                else
                    helper(i+1,target-candidates[i]);
                //回溯
                list.remove(list.size()-1);
                //当前数大于target明显无解
            }else break;
            last = candidates[i];
        }
    }*/

    List<List<Integer>> res = new ArrayList<>();
    int[] CAN;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        CAN = candidates;
        dfs(0, target, new LinkedList<>());
        return res;
    }

    public void dfs(int index, int target, LinkedList<Integer> list) {
        if (target<0) return;
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < CAN.length; i++) {
            int item = CAN[i];
            if (list.contains(item)) {
                continue;
            }

            list.addLast(item);
            dfs(i+1,target-item,list);
            list.removeLast();
        }
    }

}
