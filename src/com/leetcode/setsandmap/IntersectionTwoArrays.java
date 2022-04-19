package com.leetcode.setsandmap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {
    if(nums1==null || nums2==null) return  new int[]{};
    Set<Integer> integers = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set integers2 = (Arrays.stream(nums2).boxed().collect(Collectors.toSet()));
    Iterator<Integer> i = integers.iterator();
    while (i.hasNext()) {
        if(!integers2.contains(i.next())) i.remove();
    }
    return integers.stream().mapToInt(Integer::intValue).toArray();
  }
  public static void main(String[] args) {

  }

}
