package com.leetcode.sorting;

import java.util.Arrays;

public class ValidAnagram {

  public static boolean isAnagram(String s, String t) {
      char[] arr = s.toCharArray();
      Arrays.parallelSort(arr);
      s = new String(arr);
      arr  = t.toCharArray();
      Arrays.parallelSort(arr);
      t = new String(arr);
      if(t.equals(s)) return true;
    return false;
  }

  public static void main(String[] args) {

  }

}
