package com.codecafe.problems.second_largest_in_array;

import java.util.Arrays;

public class SecondLargest {

    private static int findSecondLargest(int arr[]) {
        int largest = 0;
        int secondLargest = 0;

        int arrSize = arr.length;

        if (arrSize < 2) {
            System.out.println("Array size cannot be less than 2");
            return -1;
        }

        // find the largest number
        for (int i = 0; i < arrSize; i++)
            largest = Math.max(largest, arr[i]);

        // find the second largest number
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] != largest)
                secondLargest = Math.max(secondLargest, arr[i]);
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 29, 18, 27, 26, 33, 77 };

        int secondLargest = findSecondLargest(arr);

        System.out.println("Input array:\n" + Arrays.toString(arr) + "\n");

        if (secondLargest != -1)
            System.out.println("Second largest number is : " + secondLargest);
    }

}