package com.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

  public static int[] productExceptSelf(int[] nums) {
    int product = 1;
    int zeroCount = 0;
    for (int num:nums) {
      if(num!=0)
        product =   product * num ;
    else zeroCount++;
    }
    for (int i = 0; i < nums.length; i++) {
      if(zeroCount>1 || (zeroCount==1 && nums[i]!=0)) nums[i] = 0;
      else if(zeroCount==1 && nums[i]==0) nums[i] = product;
      else nums[i] = product / nums[i];
    }
    return nums;
  }

  public static void main(String[] args) {
   int nums [] = {-1,1,0,-3,3};
   System.out.println(Arrays.toString(productExceptSelf(nums)));
  }

}
