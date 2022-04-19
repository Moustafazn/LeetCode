package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class KeyboardRow {

  public static String[] findWords(String[] words) {
    String a = "QWERTYUIOPqwertyuiop";
    String b = "ASDFGHJKLasdfghjkl";
    String c = "ZXCVBNMzxcvbnm";
    HashSet<Character> firstRow = new HashSet<>();
    HashSet<Character> secondRow = new HashSet<>();
    HashSet<Character> thirdRow = new HashSet<>();

    for(int i = 0;i<a.length(); i++)
      firstRow.add(a.charAt(i));

    for(int i = 0;i<b.length(); i++)
      secondRow.add(b.charAt(i));

    for(int i = 0;i<c.length(); i++)
      thirdRow.add(c.charAt(i));

    ArrayList<String> list = new ArrayList<String>();

    for(String word : words){
      int first = 0;
      int sec = 0;
      int third = 0;

      for(int i=0;i < word.length(); i++){
        if(firstRow.contains(word.charAt(i))){
          first++;
        }
        else if(secondRow.contains(word.charAt(i))){
          sec++;
        }
        else if(thirdRow.contains(word.charAt(i))){
          third++;
        }
      }

      if(first == word.length() ||sec == word.length() ||third == word.length()){
        list.add(word);
      }
    }

    return list.toArray(new String[list.size()]);
  }

  public static void main(String[] args) {
  String[] words = {"Hello","Alaska","Dad","Peace"};
 System.out.println(Arrays.stream(findWords(words)).count());
  }

}
