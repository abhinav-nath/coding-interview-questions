package com.codecafe.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:
Input: 121
Output: true

Example 2:
Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Follow up:
Could you solve it without converting the integer to a string?
 */

public class PalindromeNumber_9 {

  public static void main(String[] args) {
    List<Integer> testNumbers = new ArrayList<>();

    testNumbers.add(121);
    testNumbers.add(-121);
    testNumbers.add(10);
    testNumbers.add(1001);
    testNumbers.add(12321);

    for (int num : testNumbers)
      System.out.println(num + " : " + isPalindrome(num));
  }

  public static boolean isPalindrome(int x) {
    if (x == 0)
      return true;

    if (x < 0 || x % 10 == 0)
      return false;

    int reverse = 0;
    int rem = 0;

    // optimization - reverse till half of the number
    while (x > reverse) {
      rem = x % 10;
      x = x / 10;

      reverse = (10 * reverse) + rem;
    }

    // x will be equal to reverse in case of even length numbers
    // x will be equal to reverse/10 in case of odd length numbers
    return (x == reverse || x == reverse / 10);
  }

}