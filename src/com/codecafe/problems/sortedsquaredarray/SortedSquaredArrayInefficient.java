package com.codecafe.problems.sortedsquaredarray;

import java.util.Arrays;

/*
 * Problem statement :
 *
 *  You have a sorted array of integers. Write a function that returns a sorted
 *  array containing the squares of those integers.
 *
 *  Input array length :  1 <= N <= 10000
 *  Element            : -10000 <= array[i] <= 10000
 *
 *  - Input array will be sorted
 *  - Output array will be sorted
 *
 *  [-7, -3, -1, 4, 8, 12]   ->   [1, 9, 16, 49, 64, 144]
 *               [1, 2, 3]   ->   [1, 4, 9]
 *            [-3, -2, -1]   ->   [1, 4, 9]
 *
 * Solution's rating -> BAD - O(NlogN)
 * Better solution -> SortedSquaredArrayLinear.java
 *
 */

public class SortedSquaredArrayInefficient {

  public static void main(String[] args) {
    int[] a1 = {-7, -3, -1, 4, 8, 12};
    int[] a2 = {1, 2, 3};
    int[] a3 = {-3, -2, -1};
    int[] a4 = {-3, -2, -1, 0, 1, 2, 3};

    System.out.println("Sorted Squared Array for a1 : ");
    print(sortedSquaredArray(a1));
    System.out.println("\nSorted Squared Array for a2 : ");
    print(sortedSquaredArray(a2));
    System.out.println("\nSorted Squared Array for a3 : ");
    print(sortedSquaredArray(a3));
    System.out.println("\nSorted Squared Array for a4 : ");
    print(sortedSquaredArray(a4));
  }

  private static int[] sortedSquaredArray(int[] array) {
    int[] squaredNumbers = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      squaredNumbers[i] = array[i] * array[i];
    }

    Arrays.sort(squaredNumbers);
    return squaredNumbers;
  }

  private static void print(int[] sortedSquaredArray) {
    for (int element : sortedSquaredArray)
      System.out.print(element + " ");
  }

}