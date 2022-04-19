package com.leetcode.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {

  public int findLongestChain(int[][] pairs) {

    Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
    if (pairs.length < 2)
      return 1;
    int count = 0;
    for (int i = 0; i < pairs.length - 1; i++) {
      if (pairs[i][1] < pairs[i + 1][0]) {
      }
    }

    return 0;

  }
  public static void main(String[] args) {

  }

}
