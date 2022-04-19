package com.leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

  public static String largestNumber(int[] nums) {
   // String [] x = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
    String x[]=new String[nums.length];
    //assuming we have only zeros in nums
    boolean zero=true;
    for(int i=0;i<nums.length;i++){
      //we have at least 1 nonzero
      if(nums[i]!=0) zero=false;
      x[i]=""+nums[i];
    }

    Arrays.sort(x, (a, b) -> (b+a).compareTo(a+b));
    return zero?"0":String.join("", x);
  }

  public static void main(String[] args) {
    int[] nums = {3,30,34,5,9};
    System.out.println(largestNumber(nums));
  }

}
