package com.codecafe.problems.firstnonrepeatingcharacter;

/*
 * Problem statement :
 *
 * Given a string s consisting of small English letters,
 * find and return the first instance of a non-repeating character in it.
 * If there is no such character return '_'.
 *
 * Solution's rating -> Better than using HashMap
 * Better solution -> FirstNonRepeatingCharacterUsingBuiltInMethods.java
 *
 */

public class FirstNonRepeatingCharacterUsingArray {

  public static void main(String[] args) {
    String testString1 = "aaabcccdeeef";
    String testString2 = "aaabbbcccdddeeefffggghhhiiijjjkkklmlmnon";
    String testString3 = "aabbccdddefefgghihi";

    System.out.println("First non-repeating char in testString1 : " + firstNonRepeatingCharacter(testString1));
    System.out.println("First non-repeating char in testString2 : " + firstNonRepeatingCharacter(testString2));
    System.out.println("First non-repeating char in testString3 : " + firstNonRepeatingCharacter(testString3));
  }

  private static char firstNonRepeatingCharacter(String s) {
    // create an int array for storing the counts of all the alphabets
    // initializes with 26 zeroes
    int[] charCounts = new int[26];

    for (char c : s.toCharArray())
      charCounts[c - 'a']++;

    for (char c : s.toCharArray()) {
      if (charCounts[c - 'a'] == 1)
        return c;
    }

    return '_';
  }

}