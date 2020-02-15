package com.codecafe.leetcode.easy;

/*

Two Sum II - Input array is sorted
----------------------------------
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

 */
public class TwoSumSortedArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 4, 5, 6, 7, 11, 30 };
		int target = 10;

		System.out.println("output :");
		print(twoSumUsingTwoPointers(numbers, target));

	}

	// using two pointers -> left and right
	public static int[] twoSumUsingTwoPointers(int[] numbers, int target) {

		int left = 0;
		int right = numbers.length - 1;

		while(numbers[left] <= numbers[right]) {

			int sum = numbers[left] + numbers[right];

			if(sum > target) {
				right--;
			} else if(sum < target) {
				left++;
			} else {
				// sum = target
				return new int[] { left+1, right+1 };
			}

		}

		return new int[2];

	}

	public static void print(int[] a) {
		for(int num : a)
			System.out.print(num+" ");
	}

}