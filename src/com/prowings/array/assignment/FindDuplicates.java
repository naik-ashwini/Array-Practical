package com.prowings.array.assignment;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[]nums = {10,1,9,4,1,4,5};
		System.out.println("Given array is : "+Arrays.toString(nums));
		System.out.println("Duplicate elements are :"+Arrays.toString(duplicateNumbers(nums)));
		
		
	}
	public static int[] duplicateNumbers(int[]nums)
	{
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					counter++;
					break;
				}
			}
		}
		
		int[] duplicateElements = new int[counter];
		counter = 0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1; j<nums.length;j++)
			{
				if(nums[i] == nums[j])
				{
					duplicateElements[counter] = nums[i];
					counter++;
					break;
				}
			}
		}
		return duplicateElements;
	}
}
