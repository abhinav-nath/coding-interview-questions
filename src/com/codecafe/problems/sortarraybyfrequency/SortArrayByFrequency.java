package com.codecafe.problems.sortarraybyfrequency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * Given an integer array, sort the array according to the frequency of elements in increasing order,
 * if frequency of two elements are same then sort the elements in increasing order
 * 
 * Input  : arr[] = {2, 3, 2, 4, 5, 12, 2, 19, 3, 12}
 * Output : 3 3 3 3 2 2 2 12 12 4 5 19
 * 
 */

public class SortArrayByFrequency {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 2, 4, 5, 12, 2, 19, 3, 12, 3, 19, 1, 1};
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		List<Integer> output = new ArrayList<>();
		
		// store the element and count of its occurrence in the map
		for(int element : arr) {
			int count = frequencyMap.getOrDefault(element, 0);
			frequencyMap.put(element, count+1);
			output.add(element);
		}

		SortComparator comp = new SortComparator(frequencyMap);
		
		Collections.sort(output, comp);
		
		for(int i : output) {
			System.out.print(i+" ");
		}
	}
}

class SortComparator implements Comparator<Integer> {

	private final Map<Integer, Integer> freqMap;

	SortComparator(Map<Integer, Integer> freqMap) {
		this.freqMap = freqMap;
	}

	@Override
	public int compare(Integer num1, Integer num2) {

		int freqCompare = 0;
		int valueCompare = 0;

		// compare frequencies of both elements
		freqCompare = freqMap.get(num1).compareTo(freqMap.get(num2));

		// if frequencies are equal then compare values of both elements
		if(freqCompare == 0) {
			valueCompare = num1.compareTo(num2);
			return valueCompare;
		} else {
			return freqCompare;
		}
	}
}
