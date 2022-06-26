package com.codecafe.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 */

public class ValidParentheses_20 {

  public static void main(String[] args) {
    List<String> testStrings = new ArrayList<>();

    testStrings.add("()");
    testStrings.add("()[]{}");
    testStrings.add("(]");
    testStrings.add("([)]");
    testStrings.add("{[]}");
    testStrings.add("{}[{()()}]");

    for (String s : testStrings)
      System.out.println(s + " : " + isValid(s));
  }

  public static boolean isValid(String s) {
    if (s.length() % 2 != 0)
      return false;

    if (s.length() == 0)
      return true;

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {

      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
        stack.pop();
      } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
        stack.pop();
      } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
        stack.pop();
      }
    }

    return stack.isEmpty();
  }

}