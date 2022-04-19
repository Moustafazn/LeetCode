package com.leetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

  public static int evalRPN(String[] tokens) {
    if(tokens==null || tokens.length==0) return 0;

    Stack<Integer> stack = new Stack<>();
    for (String token : tokens) {
      if ('+' == token.charAt(0)) {
        int x = stack.pop();
        int y = stack.pop();
        stack.push(y + x);
      } else if ("-".equals(token)) {
        int x = stack.pop();
        int y = stack.pop();
        stack.push(y - x);
      } else if ('*' == token.charAt(0)) {
        int x = stack.pop();
        int y = stack.pop();
        stack.push(y * x);
      } else if ('/' == token.charAt(0)) {
        int x = stack.pop();
        int y = stack.pop();
        stack.push(y / x);
      } else {
        stack.push(Integer.valueOf(token));
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    System.out.println(evalRPN(tokens));
  }

}
