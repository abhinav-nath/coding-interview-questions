package com.codecafe.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*

Two Sum problem
--------------
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */
public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 4, 5, 8 };
		int target = 11;

		System.out.println("Brute force method :");
		print(twoSumBruteForce(nums, target));

		System.out.println("\nHashMap method :");
		print(twoSumUsingHashMap(nums, target));
	}

	// brute force method using two for loops
	public static int[] twoSumBruteForce(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for(int j=i+1; j < nums.length; j++) {

				if(nums[j] == (target - nums[i])) {
					return new int[] { i, j };
				}
			}
		}
		return new int[2];
	}

	// using HashMap to store the numbers and their indices
	public static int[] twoSumUsingHashMap(int[] nums, int target) {

		Map<Integer, Integer> numIndexMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int numToFind = target - nums[i];

			if (numIndexMap.containsKey(numToFind) && numIndexMap.get(numToFind) != i)
				return new int[] { numIndexMap.get(numToFind), i };

			numIndexMap.put(nums[i], i);
		}

		return new int[2];
	}
	
	public static void print(int[] a) {
		for(int num : a)
			System.out.print(num+" ");
	}

}