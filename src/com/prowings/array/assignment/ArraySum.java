package com.prowings.array.assignment;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 50, 30 };
		System.out.println("Given Array is : " + Arrays.toString(nums));
		int sum = sumOfArrayElements(nums);
		System.out.println("Sum of elements of array is : " + sum);

	}

	public static int sumOfArrayElements(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
