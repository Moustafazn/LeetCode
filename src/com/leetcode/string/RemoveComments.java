package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class RemoveComments {

  public static List<String> removeComments(String[] source) {
    if(source==null || source.length==0) return List.of();

    List<String> res = new ArrayList<>();
    for (String val: source){
      if(!val.contains("/") && !val.contains("\\*")){
        res.add(val);
        continue;
      }
      String[] oneLine = val.split("//");
      if(oneLine.length>1){
        res.add(oneLine[0]);
        continue;
      }

      String[] multiple = val.split("/\\*");
      if(multiple.length>1 && multiple[0].length()>1){
        res.add(multiple[0]);
        continue;
      }
      multiple = val.split("\\*/");
      if(multiple.length>1 && multiple[0].length()>1){
        res.add(multiple[1]);
        continue;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    String[] source = {"/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;", "/* This is a test", "   multiline  ",
        "   comment for ", "  testing */", "a = b + c;", "}"};
    System.out.println(removeComments(source));

  }

}
