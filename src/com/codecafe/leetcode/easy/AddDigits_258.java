package com.codecafe.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:
Input: 38
Output: 2 

Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
 */
public class AddDigits_258 {

	public static void main(String[] args) {
		List<Integer> testNumbers = new ArrayList<>();
		testNumbers.add(38);
		testNumbers.add(40);
		testNumbers.add(99);
		testNumbers.add(10234);
		testNumbers.add(341);
		testNumbers.add(9999);

		printResult(testNumbers);
	}

	public static int addDigits(int num) {
		if (num == 0)
			return 0;
		if (num % 9 == 0)
			return 9;
		else
			return num % 9;
	}

	private static void printResult(List<Integer> testNumbers) {
		for(int num : testNumbers)
			System.out.println("Input : " + num + " output : " + addDigits(num));
	}
}
