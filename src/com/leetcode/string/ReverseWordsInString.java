package com.leetcode.string;

public class ReverseWordsInString {
  public String reverseWords(String s) {
    if(s==null|| s.isEmpty()) return s;

    String[] arr = s.trim().split(" ");
    StringBuilder builder = new StringBuilder();
    for (int i=arr.length-1; i<0; i--) {
      builder.append(arr[i]);
    }
    return builder.toString();
  }

}
