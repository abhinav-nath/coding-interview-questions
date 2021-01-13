package com.codecafe.problems.arrays.contains_common_items;

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
 * BAD SOLUTION - O(n^2)
 * 
 */
public class BadSolution {

    public static void main(String[] args) {

        char[] array1 = { 'a', 'b', 'c', 'x' };
        char[] array2 = { 'z', 'x', 'w' };

        System.out.println(containsCommonItems(array1, array2));
    }

    private static boolean containsCommonItems(char[] array1, char[] array2) {
        for (char e1 : array1)
            for (char e2 : array2)
                if (e1 == e2)
                    return true;

        return false;
    }

}