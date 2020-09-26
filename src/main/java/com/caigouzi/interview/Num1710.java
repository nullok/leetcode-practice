package com.caigouzi.interview;

/**
 * @author ：lihan
 * @description： 面试题 17.10. 主要元素
 * @date ：2020/8/26 18:53
 */
public class Num1710 {
        public int majorityElement(int[] nums) {
            int val = nums[0];
            int count = 1;
            int n = nums.length;
            for(int i=1;i<n;i++){
                if(count>=1){
                    if(nums[i]==val){
                        count++;
                    }else{
                        count--;
                    }
                }else{
                    count = 1;
                    val = nums[i];
                }
            }
            return val;
        }
}
