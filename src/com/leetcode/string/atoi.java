package com.leetcode.string;

import java.math.BigInteger;
import java.util.Set;

public class atoi {


  public int myAtoi(String s) {
    if (s == null || s.length() == 0)
      return 0;

    double result = 0.0;
    int sign = 1;

    boolean numberStarted = false;

    for (char c : s.toCharArray()) {
      if (numberStarted && !Character.isDigit(c))
        break;

      if (c == '+') {
        sign = 1;
        numberStarted = true;
      } else if (c == '-') {
        sign = -1;
        numberStarted = true;
      } else if (Character.isDigit(c)) {
        result = result * 10 + c - '0';
        numberStarted = true;
      } else if (c != ' ') {
        return 0;
      }
    }

    result *= sign;
    if (result > Integer.MAX_VALUE)
      return Integer.MAX_VALUE;
    if (result < Integer.MIN_VALUE)
      return Integer.MIN_VALUE;
    return (int) result;

  }

  public static void main(String[] args) {
  }
}
