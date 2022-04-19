package com.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    if(s==null) return false;
    Stack<Character> stack = new Stack<>();
    for (int i =0; i< s.length(); i++){
      if ('{' == s.charAt(i) || '('== s.charAt(i) || '['== s.charAt(i))
        stack.push(s.charAt(i));
      else if(!stack.isEmpty() && '}'== s.charAt(i) && '{'== stack.peek())
        stack.pop();
      else if(!stack.isEmpty() && ')'== s.charAt(i) && '('== stack.peek())
        stack.pop();
      else if(!stack.isEmpty() && ']'== s.charAt(i) && '['== stack.peek())
        stack.pop();
      else return false;
    }
    return stack.isEmpty();

  }

}
