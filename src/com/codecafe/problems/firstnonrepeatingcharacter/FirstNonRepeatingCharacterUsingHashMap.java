package com.codecafe.problems.firstnonrepeatingcharacter;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem statement :
 *
 * Given a string s consisting of small English letters,
 * find and return the first instance of a non-repeating character in it.
 * If there is no such character return '_'.
 * 
 * Solution's rating -> Better
 * 
 */

public class FirstNonRepeatingCharacterUsingHashMap {

	public static void main(String[] args) {

		String testString1 = "aaabcccdeeef";
		String testString2 = "aaabbbcccdddeeefffggghhhiiijjjkkklmlmnon";
		String testString3 = "aabbccdddefefgghihi";

		System.out.println("First non-repeating char in testString1 : "+firstNonRepeatingCharacter(testString1));
		System.out.println("First non-repeating char in testString2 : "+firstNonRepeatingCharacter(testString2));
		System.out.println("First non-repeating char in testString3 : "+firstNonRepeatingCharacter(testString3));

	}

	private static char firstNonRepeatingCharacter(String s) {

		Map<Character, Integer> charCounts = new HashMap<>();

		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);

			if(charCounts.containsKey(c))
				charCounts.put(c, charCounts.get(c) + 1);
			else
				charCounts.put(c, 1);
		}

		for(char c : s.toCharArray()) {
			if(charCounts.get(c) == 1)
				return c;
		}

		return '_';
	}

}