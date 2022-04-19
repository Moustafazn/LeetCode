package com.leetcode.stack;

import java.util.Stack;

public class BackspaceStringCompare {

  public static boolean backspaceCompare(String s, String t) {
    if(s==null || t==null) return false;
    Stack<Character> stack = new Stack<>();
    for (int i =0; i< s.length(); i++){
      if ('#' != s.charAt(i))
        stack.push(s.charAt(i));
      else if(!stack.isEmpty() && '#'== s.charAt(i))
        stack.pop();
    }

    Stack<Character> stack2 = new Stack<>();
    for (int i =0; i< t.length(); i++){
      if ('#' != t.charAt(i))
        stack2.push(t.charAt(i));
      else if(!stack2.isEmpty() && '#'== t.charAt(i))
        stack2.pop();
    }

    for (int i =0; i< stack.size(); i++){
      if (!stack.isEmpty() && !stack2.isEmpty() && stack.peek()==stack2.peek()){
        stack.pop();
        stack2.pop();
      }
    }
    return stack.isEmpty() && stack2.isEmpty();

  }


  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
  }


}
