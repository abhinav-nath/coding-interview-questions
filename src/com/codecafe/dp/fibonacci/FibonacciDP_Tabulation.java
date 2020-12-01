package com.codecafe.dp.fibonacci;

/*
 * Bottom Up approach
 * We first calculate fib(0) then fib(1) then fib(2) then fib(3) and so on.
 * So literally, we are building the solutions of subproblems bottom-up.
 */
public class FibonacciDP_Tabulation {

    public static void main(String[] args) {

        int n = 9;

        System.out.println("\nFib(" + n + ") = " + fib(n));
    }

    private static int fib(int n) {

        /* Declare an array to store Fibonacci numbers. */

        int[] dp = new int[n + 1];
        int i;

        /* 0th and 1st number of the series are 0 and 1 */
        dp[0] = 0;
        dp[1] = 1;

        for (i = 2; i <= n; i++) {
            /* Add the previous 2 numbers in the series and store it */
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        for (i = 0; i < dp.length; i++)
            System.out.print(dp[i] + " ");

        return dp[n];
    }

}