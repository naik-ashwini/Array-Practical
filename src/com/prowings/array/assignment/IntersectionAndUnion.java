package com.prowings.array.assignment;

import java.util.Arrays;

public class IntersectionAndUnion {

	public static void main(String[] args) {

		int[] nums1 = { 1, 5, 12, 4, 9 };
		int[] nums2 = { 10, 5, 12, 14, 9 };
		
		System.out.println("Array 1 : "+Arrays.toString(nums1));
		System.out.println("Array 1 : "+Arrays.toString(nums2));
		
		int[] result = unionArray(nums1, nums2);
		System.out.println("Union of two Arrays : "+Arrays.toString(result));
		
		int[] result1 = intersectionArray(result);
		System.out.println("Intersection of two Arrays : "+Arrays.toString(result1));
	}

	public static int[] intersectionArray(int[] result) {
		int counter = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] == result[j]) {
					counter++;
					break;
				}
			}
		}
		
		int[] commonElements = new int[counter];
		counter = 0;
		for(int i=0;i<result.length;i++)
		{
			for(int j=i+1; j<result.length;j++)
			{
				if(result[i] == result[j])
				{
					commonElements[counter] = result[i];
					counter++;
					break;
				}
			}
		}
		return commonElements;
	}

	public static int[] unionArray(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			result[count] = nums1[i];
			count++;
		}
		for (int j = 0; j<nums2.length; j++) {
			result[count] = nums2[j];
			count++;
		}
		return result;
	}
}
