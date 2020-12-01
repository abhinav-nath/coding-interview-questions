package com.codecafe.dp.fibonacci;

public class FibonacciRecursion {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("\nFib(" + n + ") = " + fib(n));
    }

    private static int fib(int n) {

        System.out.printf("fib(%d)%n", n);

        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);

    }

}