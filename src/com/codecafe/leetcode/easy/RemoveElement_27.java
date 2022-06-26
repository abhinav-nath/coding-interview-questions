package com.codecafe.leetcode.easy;

/*
    Given an array nums and a value val, remove all instances of that value in-place and return the new length.

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    The order of elements can be changed. It doesn't matter what you leave beyond the new length.

    Example 1:
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2]
    Explanation: Your function should return length = 2, with the first two elements of nums being 2.
    It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,3,0,0], your answer will be accepted.

    Example 2:
    Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3]
    Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
    Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.

    Constraints:
    0 <= nums.length <= 100
    0 <= nums[i] <= 50
    0 <= val <= 100

 */
public class RemoveElement_27 {

  public static void main(String[] args) {
//        int nums[] = new int[] { 3, 2, 2, 3 };
//        int val = 3;

    int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    System.out.println("\ninput array, length = " + nums.length);
    for (int element : nums)
      System.out.print(element + " ");

    System.out.println();

    int len = removeElement(nums, val);

    System.out.println("\nafter removing duplicates, length = " + len);
    for (int i = 0; i < len; i++)
      System.out.print(nums[i] + " ");

    System.out.println();
  }

  private static int removeElement(int[] nums, int val) {
    if (nums.length == 0)
      return 0;

    // index to the front of array
    int j = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[j] = nums[i]; // move non-matching element to the front of array
        j++;
      }
    }

    return j;
  }

}