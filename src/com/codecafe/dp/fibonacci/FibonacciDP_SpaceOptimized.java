package com.codecafe.dp.fibonacci;

public class FibonacciDP_SpaceOptimized {

    public static void main(String[] args) {

        int n = 9;

        System.out.println("\nFib(" + n + ") = " + fib(n));
    }

    private static int fib(int n) {

        int a = 0;
        int b = 1;
        int c;

        if (n == 0)
            return a;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

}