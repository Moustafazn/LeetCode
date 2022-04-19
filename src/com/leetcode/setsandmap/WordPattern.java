package com.leetcode.setsandmap;

import java.util.HashMap;
public class WordPattern {
  public static boolean wordPattern(String pattern, String s) {
    if(pattern==null || pattern.isEmpty()|| s==null || s.isEmpty()
        || pattern.length()!= s.split(" ").length) return false;

    HashMap<Character, String> map = new HashMap<>();
    String arr[] = s.split(" ");
    for (int i=0; i<pattern.length(); i++){
      char x = pattern.charAt(i);
      if(!map.containsKey(x) && !map.containsValue(arr[i])) map.put(x, arr[i]);
      else if(map.containsKey(x) && map.get(x).equals(arr[i])) continue;
      else return false;
    }
    return true;

  }

  public static void main(String[] args) {
    String s = "abba", word  = "dog cat cat dog";
    System.out.println(wordPattern(s, word));
  }
}
