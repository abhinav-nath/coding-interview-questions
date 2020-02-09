package com.codecafe.problems.firstduplicate;
/*
 * Problem statement :
 * 
 * Given an array a that contains only numbers in the range of 1 to a.length,
 * find the first Duplicate number for which the second occurrence has the minimal index.
 * Basically return the number for which the second occurrence has a smaller index than
 * the second occurrence of the other number does. If there are no such elements, return -1.
 * 
 * Solution's rating -> BAD
 * Better solution -> FirstDuplicateUsingHashSet.java
 * 
 */
public class FirstDuplicateUsingTwoForLoops {

	public static void main(String[] args) {

		int a1[] = {3, 1, 4, 5, 6, 1, 3, 7};
		int a2[] = {1, 2, 4, 5, 6, 4, 3, 2};
		int a3[] = {1, 2, 4, 5, 6, 5, 3, 8};
		int a4[] = {1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println("First Duplicate in a1 : "+firstDuplicate(a1));
		System.out.println("First Duplicate in a2 : "+firstDuplicate(a2));
		System.out.println("First Duplicate in a3 : "+firstDuplicate(a3));
		System.out.println("First Duplicate in a4 : "+firstDuplicate(a4));

	}

	private static int firstDuplicate(int[] a) {

		// Two for loops result in a time complexity of O(n^2)
		// Most basic method of solving this problem
		
		int min_index_of_dup_second_val = a.length;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {

				if(a[i] == a[j]) {
					min_index_of_dup_second_val = Math.min(min_index_of_dup_second_val, j);
				}
			}
		}

		if(min_index_of_dup_second_val == a.length)
			return -1;
		else
			return a[min_index_of_dup_second_val];
	}

}