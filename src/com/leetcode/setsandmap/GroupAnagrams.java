package com.leetcode.setsandmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    if(strs==null || strs.length==0) return  List.of();

    HashMap<String, List<String>> map = new HashMap<>();
    for (int i=0; i< strs.length; i++){
      char[] a = strs[i].toCharArray();
      Arrays.sort(a);
      String str = String.valueOf(a);
      map.computeIfAbsent(str, k -> new ArrayList<>()).add(strs[i]);
    }
    return map.values().stream().collect(Collectors.toList());
  }

  public static void main(String[] args) {


  }

}
