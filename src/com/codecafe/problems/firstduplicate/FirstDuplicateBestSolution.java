package com.codecafe.problems.firstduplicate;

/*
 * Problem statement :
 *
 * Given an array a that contains only numbers in the range of 1 to a.length,
 * find the first Duplicate number for which the second occurrence has the minimal index.
 * Basically return the number for which the second occurrence has a smaller index than
 * the second occurrence of the other number does. If there are no such elements, return -1.
 *
 * Solution's rating -> BEST
 *
 * Key Point to construct this solution -> the values are between 1 and the length of the array !
 *                                         this means, the values can be used as indices of the array.
 *
 */
public class FirstDuplicateBestSolution {

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
    for (int i = 0; i < a.length; i++) {
      if (a[Math.abs(a[i]) - 1] < 0)
        return Math.abs(a[i]);
      else
        a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
    }
    return -1;
  }

}