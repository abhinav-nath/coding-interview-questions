package com.codecafe.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * Constraints:
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 * 
 */
public class LongestCommonPrefix_14 {

    public static void main(String[] args) {

        List<String[]> testStrings = new ArrayList<>();
        testStrings.add(new String[] { "flower", "flow", "flight" });
        testStrings.add(new String[] { "dog", "racecar", "car" });
        testStrings.add(new String[] { "amazing", "amazon", "amaze" });
        testStrings.add(new String[] { "amazing", "amazon", "am" });
        testStrings.add(new String[] { "awesome", "amazon", "amaze" });
        testStrings.add(new String[] { "hel", "hello", "helloworld" });

        printResult(testStrings);
    }

    private static void printResult(List<String[]> testStrings) {

        for (String[] strs : testStrings) {
            // findLongestCommonPrefixBadSolution(strs);
            String prefix = findLongestCommonPrefix(strs);
            System.out.println("strings: " + Arrays.asList(strs) + "\nlongest common prefix : " + prefix + "\n");
        }
    }

    /*
     * idea is to take the first string as the prefix
     * prefix = flower
     * now check if next string in array have this prefix
     * if not then reduce the prefix until next string has this prefix
     * 
     * prefix = flower
     * flow starts with flower ? no
     * prefix = flowe
     * flow starts with flowe ? no
     * prefix = flow
     * flow starts with flow ? yes
     * go to next string - flight
     * flight starts with flow ? no
     * prefix = flo
     * flight starts with flo ? no
     * prefix = fl
     * flight starts with fl ? yes
     * 
     * so the longest common prefix is - fl
     * 
     */
    private static String findLongestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];

        // start from second string
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // reduce the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    private static void findLongestCommonPrefixBadSolution(String[] strs) {
        List<Character> prefix = new ArrayList<>();

        for (int i = 0; i < strs[0].length(); i++) {

            char charToCheck = strs[0].charAt(i);

            boolean charExistsInAllStrings = false;

            for (int j = 0; j < strs.length; j++) {
                if (i < strs[j].length() && strs[j].charAt(i) == charToCheck) {
                    charExistsInAllStrings = true;
                } else {
                    charExistsInAllStrings = false;
                }
            }

            if (charExistsInAllStrings)
                prefix.add(charToCheck);
        }

        System.out.println(prefix);
    }

}