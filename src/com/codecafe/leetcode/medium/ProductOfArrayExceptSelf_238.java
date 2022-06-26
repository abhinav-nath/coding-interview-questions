package com.codecafe.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]

Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
 Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductOfArrayExceptSelf_238 {

  public static void main(String[] args) {
    List<int[]> testArrays = new ArrayList<>();

    testArrays.add(new int[]{1, 2, 3, 4});
    testArrays.add(new int[]{4, 3, 2, 1});

    printResult(testArrays);
  }


  // good solution but 2 extra arrays (leftProducts and rightProducts) can still be removed
  public static int[] productExceptSelf(int[] nums) {
    int len = nums.length;

    int[] leftProducts = new int[len];
    int[] rightProducts = new int[len];

    int[] outputArray = new int[len];

    leftProducts[0] = 1;
    rightProducts[len - 1] = 1;

    for (int i = 1; i < len; i++)
      leftProducts[i] = nums[i - 1] * leftProducts[i - 1];

    for (int i = len - 2; i >= 0; i--)
      rightProducts[i] = nums[i + 1] * rightProducts[i + 1];

    for (int i = 0; i < len; i++)
      outputArray[i] = leftProducts[i] * rightProducts[i];

    return outputArray;
  }


  // best solution
  // used outputArray unidirectionally to store left products
  // and then used a variable to store right products
  public static int[] productExceptSelfBestSolution(int[] nums) {
    int len = nums.length;

    int[] outputArray = new int[len];
    outputArray[0] = 1;

    for (int i = 1; i < len; i++)
      outputArray[i] = nums[i - 1] * outputArray[i - 1];

    int rightProduct = 1;

    for (int i = len - 1; i >= 0; i--) {
      outputArray[i] = outputArray[i] * rightProduct;
      rightProduct = rightProduct * nums[i];
    }

    return outputArray;
  }


  // easiest solution but not in the scope of the problem statement
  public static int[] productExceptSelfUsingDivision(int[] nums) {
    int productOfAll = 1;
    for (int element : nums)
      productOfAll *= element;

    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++)
      result[i] = productOfAll / nums[i];

    return result;
  }


  private static void printResult(List<int[]> testArrays) {
    for (int[] a : testArrays) {

      System.out.println("\ninput array :");
      for (int element : a)
        System.out.print(element + " ");

      System.out.println("\nresult (best solution) :");
      for (int element : productExceptSelfBestSolution(a))
        System.out.print(element + " ");

      System.out.println("\nresult :");
      for (int element : productExceptSelf(a))
        System.out.print(element + " ");

      System.out.println("\nresult using division :");
      for (int element : productExceptSelfUsingDivision(a))
        System.out.print(element + " ");

      System.out.println();
    }
  }

}