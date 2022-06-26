package com.codecafe.problems.firstnonrepeatingcharacter;

/*
 * Problem statement :
 *
 * Given a string s consisting of small English letters,
 * find and return the first instance of a non-repeating character in it.
 * If there is no such character return '_'.
 *
 * Solution's rating -> Best - O(n)
 *
 */

public class FirstNonRepeatingCharacterUsingBuiltInMethods {

  public static void main(String[] args) {
    String testString1 = "aaabcccdeeef";
    String testString2 = "aaabbbcccdddeeefffggghhhiiijjjkkklmlmnon";
    String testString3 = "aabbccdddefefgghihi";

    System.out.println("First non-repeating char in testString1 : " + firstNonRepeatingCharacter(testString1));
    System.out.println("First non-repeating char in testString2 : " + firstNonRepeatingCharacter(testString2));
    System.out.println("First non-repeating char in testString3 : " + firstNonRepeatingCharacter(testString3));
  }

  private static char firstNonRepeatingCharacter(String s) {
    // use indexOf() and lastIndexOf() built-in methods
    // .indexOf() == .lastIndexOf()

    for (int i = 0; i < s.length(); i++) {
      if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
        return s.charAt(i);
    }

    return '_';
  }

}