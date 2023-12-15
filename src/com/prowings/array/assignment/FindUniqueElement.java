package com.prowings.array.assignment;

import java.util.Arrays;

public class FindUniqueElement {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 2, 6, 1, 6 };
		System.out.println("Original Array elements are: " + Arrays.toString(nums));

		int[] uniqueNumbers = findUniqueNumbers(nums);
		System.out.println("Unique Numbers are: " + Arrays.toString(uniqueNumbers));
	}

	public static int[] findUniqueNumbers(int[] nums) {
		int n = nums.length;
		int counter = 1;
		int[] output = new int[n];
		output[0] = nums[0];
		int flag = 0;

		for (int i = 1; i < n; i++) {
			flag = 0;
			for (int j = 0; j < counter; j++) {
				if (output[j] == nums[i]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				output[counter] = nums[i];
				counter++;
			}
		}
		System.out.println("Numbers before copying to new array: " + Arrays.toString(output));
		int[] result = Arrays.copyOf(output, counter);
		return result;
	}
}
