package com.codecafe.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.

For example, with A = "abcd" and B = "cdabcdab".

Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").

Note:
The length of A and B will be between 1 and 10000.
 */

public class RepeatedStringMatch_686 {

	public static void main(String[] args) {

		Map<String, String> testStrings = new HashMap<>();
		testStrings.put("abcd", "cdabcdab");
		testStrings.put("xyz", "abcd");
		testStrings.put("helloworld", "hello");
		testStrings.put("a", "a");

		printResult(testStrings);
	}


	public static int repeatedStringMatch(String A, String B) {

		if(checkLength(A) && checkLength(B)) {

			if(A.contains(B))
				return 1;

			StringBuilder sb = new StringBuilder(A);

			int counter = 1;

			do {
				counter++;
				sb.append(A);
				if(-1 != sb.indexOf(B))
					return counter;
			} while(sb.length() <= 10000);
		}
		return -1;
	}


	private static boolean checkLength(String str) {
		return (str.length() >= 1 && str.length() <= 10000) ? true : false;
	}


	private static void printResult(Map<String, String> testStrings) {

		for(Map.Entry<String, String> entry : testStrings.entrySet()) {
			System.out.println("\ntest Strings - " + entry.getKey() + " and " + entry.getValue());			
			int n = repeatedStringMatch(entry.getKey(), entry.getValue());
			if(-1 == n)
				System.out.println("no solution");
			else
				System.out.println(entry.getKey() + " must be repeated " + n + " times to have " + entry.getValue() + " as a substring of it");
		}
	}

}