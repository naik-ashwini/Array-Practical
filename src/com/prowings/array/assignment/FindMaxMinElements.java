package com.prowings.array.assignment;

import java.util.Arrays;

public class FindMaxMinElements {

	public static void main(String[] args) {

		int[] nums = { 15, 5, 8, 20, 10 };
		System.out.println("Given Array is : " + Arrays.toString(nums));
		findMaxMinNumber(nums);
	}

	public static void findMaxMinNumber(int[] nums) {
		int n = nums.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("Array after Sorting: " + Arrays.toString(nums));

		int maxNumber = nums[n - 1];
		System.out.println("Maximum number from given array is : " + maxNumber);

		int minNumber = nums[0];
		System.out.println("Minimum number from given array is : " + minNumber);
	}
}
