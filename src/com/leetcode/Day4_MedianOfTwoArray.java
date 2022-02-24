package com.leetcode;

/*Problem statement:


 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 

	The overall run time complexity should be O(log (m+n)).
	
	 
	
	Example 1:
	
	Input: nums1 = [1,3], nums2 = [2]
	Output: 2.00000
	Explanation: merged array = [1,2,3] and median is 2.
	Example 2:
	
	Input: nums1 = [1,2], nums2 = [3,4]
	Output: 2.50000
	Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 
	
	Constraints:
	
		nums1.length == m
		nums2.length == n
		0 <= m <= 1000
		0 <= n <= 1000
		1 <= m + n <= 2000
		-106 <= nums1[i], nums2[i] <= 106
		
*/

import java.util.Arrays;

public class Day4_MedianOfTwoArray {

	public static void main(String[] args) {
		Day4_MedianOfTwoArray medianArr = new Day4_MedianOfTwoArray();
		int[] arr1 = { 1, 3 };
		int[] arr2 = { 2, 4 };
		double d = medianArr.findMedianSortedArrays(arr1, arr2);
		System.out.println(d);
	}

	// Func to find the median of two array and return a double value

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] c1 = new int[nums1.length + nums2.length];
		copyArrayOddEven(nums1, nums2, c1);
		Arrays.sort(c1);

		double d = 0.0;
		if (c1.length % 2 != 0) {
			d = (double) c1[(c1.length) / 2];
			return d;
		} else {
			d = (double) (c1[((c1.length) / 2) - 1] + c1[(c1.length) / 2]) / 2;
			return d;
		}

	}

	// Func to Merge two Arrays
	public static void copyArrayOddEven(int a[], int b[], int c[]) {
		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {

			c[a.length + i] = b[i];
		}

	}

}

//Result:

/*
 * Runtime: 7 ms, faster than 24.90% of Java online submissions for Median of
 * Two Sorted Arrays.
 * 
 * Memory Usage: 50.5 MB, less than 8.52% of Java online submissions for Median
 * of Two Sorted Arrays.
 */

/*
 * Runtime: 3 ms, faster than 81.41% of Java online submissions for Median of
 * Two Sorted Arrays. Memory Usage: 43.5 MB, less than 74.25% of Java online
 * submissions for Median of Two Sorted Arrays.
 */
