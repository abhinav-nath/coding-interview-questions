package com.codecafe.problems.arrays.maximum_subarray;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array numbers, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4],
Output: 6
Explanation: [4, -1, 2, 1] has the largest sum = 6.

Follow up:
If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubArray {

    public static void main(String[] args) {
        List<int[]> testArrays = new ArrayList<>();

        testArrays.add(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
        testArrays.add(new int[] { 4, 3, 0, -2, 3, -2, -5, 6 });
        testArrays.add(new int[] { 10, -6, 1, -1, -5, 2, -1, 3, 0, 3, -1, 9, -5 });

        printResult(testArrays);
    }

    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);
        }

        return max;
    }

    private static void printResult(List<int[]> testArrays) {

        for (int[] a : testArrays) {

            for (int element : a)
                System.out.print(element + " ");

            System.out.print(" max sub array = " + maxSubArray(a) + "\n");
        }
    }
}