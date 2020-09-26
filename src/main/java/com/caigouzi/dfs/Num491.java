package com.caigouzi.dfs;

import java.util.*;

/**
 * @author ：lihan
 * @description： 491. 递增子序列
 * @date ：2020/8/25 7:07
 */
public class Num491 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        HashSet<List<Integer>> lists = new HashSet<>();
        ArrayList<Integer> one = new ArrayList<>(integers);
        ArrayList<Integer> two = new ArrayList<>(integers);
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        lists.add(one);
        lists.add(two);

        System.out.println(lists.size());
    }
    List<List<Integer>> res = new ArrayList<>();
    HashSet<List<Integer>> tmp = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums, 0, new LinkedList<>());
//        res.addAll(tmp);
        return res;
    }

    public void dfs(int[] nums,int index, LinkedList<Integer> list) {
        if (index >= nums.length) {
            if (list.size() >= 2) {
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if (list.isEmpty() || nums[index] >= list.peekLast()) {
            list.add(nums[index]);
            dfs(nums, index + 1, list);
            list.removeLast();
        }
        if (index > 0 && !list.isEmpty() && nums[index] == list.peekLast()) {
            return;
        }

        dfs(nums, index + 1, list);
    }


}
