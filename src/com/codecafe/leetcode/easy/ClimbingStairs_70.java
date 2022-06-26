package com.codecafe.leetcode.easy;

import java.util.Scanner;

/*
    Classic problem of Dynamic Programming
    --------------------------------------
    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Example 1:
    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps

    Example 2:
    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step

    Constraints:
    1 <= n <= 45

 */

public class ClimbingStairs_70 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int num = sc.nextInt();

      if (num > 45 || num < 1) {
        System.out.println("Invalid input");
        break;
      } else {
        int numOfWays = climbStairs(num);
        System.out.println("Number of ways to climb " + num + " stairs = " + numOfWays);
      }
    }

    sc.close();
  }

  private static int climbStairs(int n) {
    if (n == 1)
      return 1;

    if (n == 2)
      return 2;

    int[] ways = new int[n + 1];
    ways[1] = 1;
    ways[2] = 2;

    for (int i = 3; i <= n; i++) {
      ways[i] = ways[i - 2] + ways[i - 1];
    }

    return ways[n];
  }

}