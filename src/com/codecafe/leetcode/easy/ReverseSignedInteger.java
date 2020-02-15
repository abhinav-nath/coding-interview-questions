package com.codecafe.leetcode.easy;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseSignedInteger {

	public static void main(String[] args) {

		int num = 123;
		System.out.println("reverse("+num+") = "+reverse(num));
		
		num = -123;
		System.out.println("reverse("+num+") = "+reverse(num));
		
		num = 120;
		System.out.println("reverse("+num+") = "+reverse(num));
		
		num = 1534236469;
		System.out.println("reverse("+num+") = "+reverse(num));
		
	}

	private static int reverse(int x) {

		int reverse=0;
		int rem=0;
		
		while(x != 0) {
			rem = x % 10;
			x = x/10;
			
			if(reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE/10 && rem > 7)
				return 0;
			
			if(reverse < Integer.MIN_VALUE/10 || reverse == Integer.MIN_VALUE/10 && rem < -8)
				return 0;
			
			reverse = (10 * reverse) + rem;
		}
		
		return reverse;
	}

}