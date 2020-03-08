package com.codecafe.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,1]
Output: 1

Example 2:
Input: [4,1,2,1,2]
Output: 4
 */

public class SingleNumber_136 {

	public static void main(String[] args) {

		int[] nums = new int[]{ 2, 2, 1 };
		System.out.print("Using HashMap : "+singleNumberUsingHashMap(nums)+"\t");
		System.out.print("Using XOR : "+singleNumberUsingXOR(nums)+"\n");
		
		nums = new int[]{ 4, 1, 2, 1, 2 };
		System.out.print("Using HashMap : "+singleNumberUsingHashMap(nums)+"\t");
		System.out.print("Using XOR : "+singleNumberUsingXOR(nums)+"\n");

	}

	// unoptimized but one way of solving this problem
	public static int singleNumberUsingHashMap(int[] nums) {

		Map<Integer, Integer> numberFrequencyMap = new HashMap<>();

		for(int i=0; i < nums.length; i++) {

			if(!numberFrequencyMap.containsKey(nums[i])) {
				numberFrequencyMap.put(nums[i], 1);
			} else {
				numberFrequencyMap.put(nums[i], numberFrequencyMap.get(nums[i])+1);
			}
		}

		for(Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {

			if(entry.getValue() == 1) {
				return entry.getKey();
			}

		}

		return -1;
	}


	// using XOR - highly optimized linear solution !
	// 0 ^ num = num
	// num ^ num = 0
	
	// consider this example : {2, 1, 2}
	// 0 ^ 2 = 2
	// 2 ^ 1 = 3
	// 3 ^ 2 = 1
	public static int singleNumberUsingXOR(int[] nums) {

		int result = 0;

		for(int i=0; i < nums.length; i++) 
			result ^= nums[i];	

		return result;
	}

}
