package com.codecafe.problems.merge_sorted_arrays;

/*
 * Merge Sorted Arrays
 * 
 * mergeSortedArrays( [ 0, 3, 4, 31 ], [ 4, 6, 30 ] )
 * 
 * output
 * [ 0, 3, 4, 4, 6, 30, 31 ]
 */
public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] array1 = { 0, 3, 4, 31 };
        int[] array2 = { 4, 6, 30 };

        int[] mergedArray = mergeSortedArrays(array1, array2);

        for (int e : mergedArray)
            System.out.print(e + " ");
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {

        int j = 0;
        int k = 0;

        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < mergedArray.length; i++) {
            if (j != array1.length && (k == array2.length || array1[j] < array2[k])) {
                mergedArray[i] = array1[j];
                j++;
            } else {
                mergedArray[i] = array2[k];
                k++;
            }
        }
        return mergedArray;
    }

}