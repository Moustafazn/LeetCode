package com.leetcode.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
  public static List<String> summaryRanges(int[] nums) {
      if(nums==null || nums.length<2) return List.of();

      int count=1;
      int pointer  = 0;
      List<String> res = new ArrayList<>();
    for (int i = 1; i <= nums.length; i++) {
      if( i< nums.length &&nums[i]-nums[i-1]==1){
        count++;
      }else{
        if(count>1)
          res.add(nums[pointer]+"->"+nums[i-1]);
        else
          res.add(nums[pointer]+"");
        pointer+=count;
        count=1;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}));
  }
}
