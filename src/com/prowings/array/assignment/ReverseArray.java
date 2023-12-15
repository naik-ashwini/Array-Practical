package com.prowings.array.assignment;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] nums = { 45, 25, 41, 22, 31 };
		System.out.println("Given Array is : " + Arrays.toString(nums));

		System.out.println("Reversed array of given array is : " + Arrays.toString(reverseAnArray(nums)));
	}

	public static int[] reverseAnArray(int[] nums) {
		int[] reversedArray = new int[nums.length];
		int count = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			reversedArray[count] = nums[i];
			count++;
		}
		return reversedArray;
	}
}
