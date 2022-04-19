package com.leetcode.TwoPointers;

import java.util.Set;

public class ReverseVowelsOfString {
  static  public String reverseVowels(String s) {
    if (s==null || s.isEmpty()) return s;

    Set<Character> set = Set.of('a','A', 'E' , 'I', 'O', 'U','e', 'i', 'o', 'u');
    int l = 0, r = s.length() - 1;
    char[] chars = s.toCharArray();
    while (l < r) {
      if(!set.contains(s.charAt(l) ))
        l++;
      else if (!set.contains(s.charAt(r)))
       r--;
      else {
        char c = chars[l];
        chars[l] = chars[r];
        chars[r] = c;
        l++;
        r--;
      }
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    System.out.println(reverseVowels("A man, a plan, a canal: Panama"));
  }
}
