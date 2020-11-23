package com.codecafe.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class PlusOne_66 {

    public static void main(String[] args) {
        List<int[]> testArrays = new ArrayList<>();

        testArrays.add(new int[] { 1, 2, 3 });
        testArrays.add(new int[] { 4, 3, 2, 1 });
        testArrays.add(new int[] { 1, 3, 9 });
        testArrays.add(new int[] { 1, 9, 9, 9 });
        testArrays.add(new int[] { 9, 9, 9 });
        testArrays.add(new int[] { 9, 9, 9, 9 });
        testArrays.add(new int[] { 1, 0, 9, 0 });

        printResult(testArrays);

    }

    public static int[] plusOne(int[] digits) {

        int l = digits.length;

        for (int i = l - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // case of 999 where we have to expand the array size for 1000 (999+1)
        int[] newNumber = new int[l + 1];
        newNumber[0] = 1;
        return newNumber;

    }

    private static void printResult(List<int[]> testArrays) {

        for (int[] a : testArrays) {

            for (int element : a)
                System.out.print(element + " ");

            System.out.print(" plus one = ");

            for (int element : plusOne(a))
                System.out.print(element + " ");

            System.out.println();
        }
    }
}