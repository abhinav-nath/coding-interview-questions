package com.codecafe.problems.sortedsquaredarray;

/*
 * Problem statement :
 * 
 *  You have a sorted array of integers. Write a function that returns a sorted
 *  array containing the squares of those integers.
 *  
 *  Input array length :  1 <= N <= 10000
 *  Element            : -10000 <= array[i] <= 10000  
 *  
 *  - Input array will be sorted
 *  - Output array will be sorted
 *  
 *  [-7, -3, -1, 4, 8, 12]   ->   [1, 9, 16, 49, 64, 144]
 *               [1, 2, 3]   ->   [1, 4, 9]
 *            [-3, -2, -1]   ->   [1, 4, 9]
 *  
 * Solution's rating -> GREAT - O(N) linear
 * 
 */

public class SortedSquaredArrayLinear {

	public static void main(String[] args) {

		int a1[] = {-7, -3, -1, 4, 8, 12};
		int a2[] = {1, 2, 3};
		int a3[] = {-3, -2, -1};
		int a4[] = {-3, -2, -1, 0, 1, 2, 3};
		
		System.out.println("Sorted Squared Array for a1 : "); print(sortedSquaredArray(a1));
		System.out.println("\nSorted Squared Array for a2 : "); print(sortedSquaredArray(a2));
		System.out.println("\nSorted Squared Array for a3 : "); print(sortedSquaredArray(a3));
		System.out.println("\nSorted Squared Array for a4 : "); print(sortedSquaredArray(a4));

	}

	private static int[] sortedSquaredArray(int[] array) {

		// initialize the result array with zeroes
		int[] result = new int[array.length];

		// in a sorted array of numbers, the biggest number can be either the leftmost one (-ve) or the rightmost one.
		int left = 0;
		int right = array.length-1;

		// start the loop backwards to fill the biggest squared number first
		for(int i = array.length - 1; i >= 0; i--) {
			if(Math.abs(array[left]) > array[right]) {
				result[i] = array[left] * array[left];
				left++;
			} else {
				result[i] = array[right] * array[right];
				right--;
			}
		}

		return result;

	}
	
	private static void print(int[] sortedSquaredArray) {
		
		for(int element : sortedSquaredArray)
		System.out.print(element+" ");
	}

}