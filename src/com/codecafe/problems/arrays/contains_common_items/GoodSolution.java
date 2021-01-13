package com.codecafe.problems.arrays.contains_common_items;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two arrays, create a function that lets a user know (true/false)
 * whether these two arrays contain any common items
 *
 * array1 = { 'a', 'b', 'c', 'x' };
 * array2 = { 'z', 'y', 'w' };
 *
 * returns false
 *
 * array1 = { 'a', 'b', 'c', 'x' };
 * array2 = { 'z', 'x', 'w' };
 *
 * returns true
 *
 * GOOD SOLUTION - O(n + n) = O(n)
 *
 */
public class GoodSolution {

    public static void main(String[] args) {

        char[] array1 = { 'a', 'b', 'c', 'x' };
        char[] array2 = { 'z', 'x', 'w' };

        System.out.println(containsCommonItems(array1, array2));
    }

    private static boolean containsCommonItems(char[] array1, char[] array2) {

        Map<Character, Boolean> charMap = new HashMap<>();

        for (char e : array1)
            if (charMap.get(e) == null)
                charMap.put(e, true);

        for (char e : array2)
            if (charMap.get(e) != null)
                return true;

        return false;
    }

}