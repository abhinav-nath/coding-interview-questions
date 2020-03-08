package com.codecafe.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */
public class LengthOfLastWord_58 {

	public static void main(String[] args) {

		List<String> testStrings = new ArrayList<>();

		testStrings.add("Hello World");
		testStrings.add("Hello World ");
		testStrings.add(" ");
		testStrings.add("");
		testStrings.add(" test string");
		testStrings.add("hello");
		testStrings.add("a");
		testStrings.add("a ");

		for(String s : testStrings)
			System.out.println("length of last word in string <" + s + "> = " + lengthOfLastWordCustom(s));

	}

	public static int lengthOfLastWord(String s) {
		String str[] = s.split(" ");

		if(str.length == 0)
			return 0;

		return str[str.length-1].length();
	}

	public static int lengthOfLastWordCustom(String s) {

		int count = 0;

		s = s.trim();

		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ')
				count++;
			else
				break;
		}

		return count;
	}

}