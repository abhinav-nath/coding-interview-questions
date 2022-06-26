package com.codecafe.problems.reverse_a_string;

/*
 * Reverse a String
 *
 * input:
 * Hello my name is John
 *
 * output:
 *
 */
public class ReverseAString {

  public static void main(String[] args) {
    String str = "Hello my name is John";

    System.out.println(str);
    System.out.println(reverseString(str));
  }

  private static String reverseString(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }

    return sb.toString();
  }

}