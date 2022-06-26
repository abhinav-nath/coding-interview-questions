package com.codecafe.dp.totalnumofways;

/*

Given 3 numbers {1, 3, 5}, we need to tell
the total number of ways we can form a number 'N'
using the sum of the given three numbers.
(allowing repetitions and different arrangements).

Total number of ways to form 6 is: 8
1+1+1+1+1+1
1+1+1+3
1+1+3+1
1+3+1+1
3+1+1+1
3+3
1+5
5+1

 */

public class TotalNumberOfWays {

  public static void main(String[] args) {
    int n = 3;
    System.out.println("Total Number of ways = " + solve(n));
  }

  private static int solve(int n) {
    if (n < 1)
      return 0;

    if (n == 1)
      return 1;

    return solve(n - 1) + solve(n - 3) + solve(n - 5);
  }

}