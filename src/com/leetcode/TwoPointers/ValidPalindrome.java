package com.leetcode.TwoPointers;

import java.util.Locale;

public class ValidPalindrome {
  static boolean isPalindrome(String s) {
    if (s == null || s.length() == 0)
      return true;
    StringBuilder x = new StringBuilder();
    for (char c: s.toCharArray()) {
      if(Character.isAlphabetic(c))
        x.append(c);
    }
    x = new StringBuilder(x.toString().toLowerCase());
    System.out.println(x.toString());
    int l = 0, r = x.length() - 1;
    while (l < r) {
      if (x.charAt(l) != x.charAt(r))
        return false;
      l++; r--;
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
  }
}
