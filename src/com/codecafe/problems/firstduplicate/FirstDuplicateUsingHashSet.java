package com.codecafe.problems.firstduplicate;

import java.util.HashSet;
import java.util.Set;

/*
 * Problem statement :
 *
 * Given an array a that contains only numbers in the range of 1 to a.length,
 * find the first Duplicate number for which the second occurrence has the minimal index.
 * Basically return the number for which the second occurrence has a smaller index than
 * the second occurrence of the other number does. If there are no such elements, return -1.
 *
 * Solution's rating -> GOOD (but can be improved further - achieve linear time complexity without using extra storage)
 *
 * Better solution -> FirstDuplicateBestSolution.java
 *
 */
public class FirstDuplicateUsingHashSet {

  public static void main(String[] args) {
    int[] a1 = {3, 1, 4, 5, 6, 1, 3, 7};
    int[] a2 = {1, 2, 4, 5, 6, 4, 3, 2};
    int[] a3 = {1, 2, 4, 5, 6, 5, 3, 8};
    int[] a4 = {1, 2, 3, 4, 5, 6, 7, 8};

    System.out.println("First Duplicate in a1 : " + firstDuplicate(a1));
    System.out.println("First Duplicate in a2 : " + firstDuplicate(a2));
    System.out.println("First Duplicate in a3 : " + firstDuplicate(a3));
    System.out.println("First Duplicate in a4 : " + firstDuplicate(a4));
  }

  private static int firstDuplicate(int[] a) {
    // Space complexity can be used to reduce the time complexity
    // We can use a storage to store the seen values and use a single for loop
    Set<Integer> seen = new HashSet<>();

    for (int j : a) {
      if (seen.contains(j)) {
        return j;
      } else {
        seen.add(j);
      }
    }
    return -1;
  }

}