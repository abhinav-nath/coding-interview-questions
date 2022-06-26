package com.codecafe.dp.fibonacci;

import java.util.Arrays;

/* Java program for Memoized version */
public class FibonacciDPMemoization {

  static int[] memo;

  private static void initialize(int n) {
    memo = new int[n + 1];
    Arrays.fill(memo, -1);
  }

  private static int fib(int n) {

    if (memo[n] == -1) {
      if (n <= 1)
        memo[n] = n;
      else
        memo[n] = fib(n - 1) + fib(n - 2);
    }

    return memo[n];
  }

  public static void main(String[] args) {
    int n = 10;
    initialize(n);

    System.out.println("Fibonacci number is : " + " " + fib(n));

    for (int e : memo)
      System.out.print(e + " ");
  }

}