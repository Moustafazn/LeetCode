package com.leetcode;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i<=max && max < nums.length; i++) {
            max = Math.max(i+nums[i], max);
        }

        return max >=nums.length-1;
    }



    public static void main(String[] args) {
        int [] nums = {2,3,1,0,4};
            System.out.println(canJump(nums));
    }
}
