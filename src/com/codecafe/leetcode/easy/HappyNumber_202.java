package com.codecafe.leetcode.easy;

import java.util.HashSet;
import java.util.Scanner;

/*

Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.

Example:

Input: 19
Output: true

Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

 */

public class HappyNumber_202 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int num = sc.nextInt();

      if (num == 999) {
        System.out.println("Invalid input");
        break;
      } else {
        boolean isHappy = isHappy(num);
        System.out.println("isHappy(" + num + ") = " + isHappy);
      }
    }

    sc.close();
  }

  private static boolean isHappy(int n) {
    HashSet<Integer> seen = new HashSet<>();

    while (n != 1) {
      int current = n;
      int sum = 0;

      while (current != 0) {
        sum += (current % 10) * (current % 10);
        current /= 10;
      }

      if (seen.contains(sum)) {
        return false;
      }

      seen.add(sum);
      n = sum;
    }

    return true;
  }

}