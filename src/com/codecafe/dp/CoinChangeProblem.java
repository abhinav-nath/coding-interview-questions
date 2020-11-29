package com.codecafe.dp;

import java.util.Arrays;

/*
 * Coins denomination -> 7, 5, 1
 * 
 * find minimum number of coins to obtain a given amount
 * 
 */
public class CoinChangeProblem {

    public static void main(String[] args) {

        int a[] = new int[] { 7, 5, 1 };

        int n = 18;

        int dp[] = new int[n + 1];

        Arrays.fill(dp, -1);

        dp[0] = 0;

        // System.out.println("minimum number of coins = " + minCoinsWithoutDP(targetAmount, coins));
        System.out.println("minimum number of coins = " + minCoins(n, a, dp));

        for(int x : dp)
            System.out.print(x + " ");
    }

    private static int minCoinsWithoutDP(int n, int[] a) {

        if (n == 0)
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (n - a[i] >= 0) {
                int subAns = minCoinsWithoutDP(n - a[i], a);

                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }

        return ans;
    }

    private static int minCoins(int n, int[] a, int[] dp) {

        if (n == 0)
            return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (n - a[i] >= 0) {
                int subAns = 0;
                if (dp[n - a[i]] != -1) {
                    subAns = dp[n - a[i]];
                } else {
                    subAns = minCoins(n - a[i], a, dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }

        dp[n] = ans;

        return dp[n];
    }

}