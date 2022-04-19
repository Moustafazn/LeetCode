package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestContinuousIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {
        int max =1;
        int temp =1;
        if(nums == null || nums.length == 0) return max;
        for (int j = 0; j <nums.length-1; j++) {
            if(nums[j] < nums[j+1])
                temp++;
            else
                temp=1;
            max = Math.max(temp, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[]  nums = {2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }
}
