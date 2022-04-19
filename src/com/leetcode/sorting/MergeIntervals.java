package com.leetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {


  public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    LinkedList<int[]> nonOverLapped = new LinkedList<>();
    for (int[] arr: intervals){
      if(nonOverLapped.isEmpty() || nonOverLapped.getLast()[1]< arr[0])
        nonOverLapped.add(arr);
      else {
        nonOverLapped.getLast()[1] = Math.max(nonOverLapped.getLast()[1], arr[1]);
      }
    }
    return nonOverLapped.toArray(new int[nonOverLapped.size()][]);
  }

  public static void main(String[] args) {
    //[[1,4],[2,3]]
    int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
    merge(nums);
  }



}
