package com.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestAbsoluteFilePath {

  public int lengthLongestPath(String input) {
    if(input == null || input.isEmpty()) return 0;

    int len = 0;
    Map<Integer, Integer> levels = new HashMap<>();
    String[] lines = input.split("\n");

    for (String line:lines) {
      int level = 0;
      while (line.charAt(level) == '\t') {
        level++;
      }

      String cleanLine = line.replaceAll("\t", "");
      int currentLength = levels.getOrDefault(level - 1, 0) + cleanLine.length();
      if (cleanLine.contains("."))
        len = Math.max(len, currentLength);

      levels.put(level, currentLength+1);
    }
    return len;
  }

  public static void main(String[] args) {
    String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";

  }
}
